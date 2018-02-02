package com.android.learn.widget.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.learn.BaseActivity;
import com.android.learn.R;
import com.android.learn.adapter.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j on 2018/2/2.
 */

public class RecyclerViewActivity  extends BaseActivity{
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;
    private ItemAdapter mAdapter;
    List<String> mDatas = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recycler);
        initView();
    }

    private void initView() {
        for (int i = 0;i<50;i++){
            mDatas.add("我的第"+i+"个Item");
        }

        mRecyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(RecyclerViewActivity.this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new ItemAdapter(mDatas);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }
}
