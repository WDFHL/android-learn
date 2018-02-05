package com.android.learn.widget.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.android.learn.BaseActivity;
import com.android.learn.R;
import com.android.learn.adapter.ItemAdapter;
import com.android.learn.widget.view.MyItemDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j on 2018/2/2.
 */

public class CoordinatorLayoutActivity  extends BaseActivity {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;
    private ItemAdapter mAdapter;
    List<String> mDatas = new ArrayList<>();
    private Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_coordinator);

        for (int i = 0;i<50;i++){
            mDatas.add("我的第"+i+"个Item");
        }
        initView();
    }

        private void initView() {
            mRecyclerView = findViewById(R.id.recyclerView);
            layoutManager = new LinearLayoutManager(CoordinatorLayoutActivity.this,LinearLayoutManager.VERTICAL,false);
            mRecyclerView.setLayoutManager(layoutManager);
            mRecyclerView.addItemDecoration(new MyItemDecoration());//添加分割线
            mAdapter = new ItemAdapter(mDatas);
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setHasFixedSize(true);//如果适配器更改不会影响RecyclerView的大小，则为true。
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
            mToolbar = findViewById(R.id.toolbar);
            mToolbar.setTitle("Title");
            mToolbar.setSubtitle("SubTitle");
            mToolbar.setLogo(R.mipmap.ic_launcher);
        }
}
