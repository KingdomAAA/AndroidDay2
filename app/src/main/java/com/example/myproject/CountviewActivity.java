package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountviewActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countview);
        Log.i(TAG, "FrameLayoutActivity onCreate");
        initView();
    }

    private void initView() {
        ViewGroup root = findViewById(R.id.root);
        int count = countview(root);
        TextView text = findViewById(R.id.tv6);
        text.setText("当前共有"+count+"个view");
    }

    public int countview(ViewGroup root){
        int count = 0;
        if(root instanceof ViewGroup)
        {
            for(int i=0;i<((ViewGroup)root).getChildCount();i++){
                if(((ViewGroup)root).getChildAt(i) instanceof ViewGroup){
                    count+=countview((ViewGroup) root.getChildAt(i));
                }else {
                    count++;
                }
            }
        }
        return count;
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "CountviewActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "CountviewActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "CountviewActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "CountviewActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "CountviewActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "CountviewActivity onDestroy");
    }

}