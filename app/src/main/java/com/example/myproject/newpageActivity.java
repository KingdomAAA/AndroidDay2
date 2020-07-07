package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class newpageActivity  extends AppCompatActivity {
    private static final String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpage);
        Log.i(TAG, "newpageActivity onCreate");
        initView();
    }

    private void initView() {
        TextView text = findViewById(R.id.tv);

        Bundle bundle = getIntent().getExtras();
        int position= bundle.getInt("position");
        text.setText("当前是第"+position+"个item");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "newpageActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "newpageActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "newpageActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "newpageActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "newpageActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "newpageActivity onDestroy");
    }
}
