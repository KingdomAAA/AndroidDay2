package com.example.myproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myproject.recycler.LinearItemDecoration;
import com.example.myproject.recycler.MyAdapter;
import com.example.myproject.recycler.TestData;
import com.example.myproject.recycler.TestDataSet;

public class RecyclerViewActivity extends AppCompatActivity implements MyAdapter.IOnItemClickListener, View.OnClickListener {

    private static final String TAG = "TAG";

    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        Log.i(TAG, "RecyclerViewActivity onCreate");
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycler);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        findViewById(R.id.imgbtn1).setOnClickListener(this);
        findViewById(R.id.imgbtn2).setOnClickListener(this);
        findViewById(R.id.imgbtn3).setOnClickListener(this);
        findViewById(R.id.imgbtn4).setOnClickListener(this);

        mAdapter = new MyAdapter(TestDataSet.getData());
        mAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(mAdapter);
        LinearItemDecoration itemDecoration = new LinearItemDecoration(Color.BLUE);
//        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
//        DefaultItemAnimator animator = new DefaultItemAnimator();
//        animator.setAddDuration(3000);
//        recyclerView.setItemAnimator(animator);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "RecyclerViewActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "RecyclerViewActivity onResume");
    }


    @Override
    public void onItemCLick(int position, TestData data) {
        Intent myIntent = new Intent(this, newpageActivity.class);
        myIntent.putExtra("position", position);
        startActivity(myIntent);
    }

    @Override
    public void onItemLongCLick(int position, TestData data) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgbtn1:
                Intent intent1 = new Intent(this, haoyouActivity.class);
                startActivity(intent1);
                break;
            case R.id.imgbtn2:
                Intent intent2 = new Intent(this, dianzanActivity.class);
                startActivity(intent2);
                break;
            case R.id.imgbtn3:
                Intent intent3 = new Intent(this, aiteActivity.class);
                startActivity(intent3);
                break;
            case R.id.imgbtn4:
                Intent intent4 = new Intent(this, pinglunActivity.class);
                startActivity(intent4);
                break;
        }
    }
}