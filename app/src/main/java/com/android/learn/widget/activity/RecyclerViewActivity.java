package com.android.learn.widget.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.android.learn.BaseActivity;
import com.android.learn.R;
import com.android.learn.adapter.ItemAdapter;
import com.android.learn.widget.view.MyItemDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 *  1.给每个item 加载动画 下一个比上一个晚一点
 *  2.视图动画和属性动画
 *  3.每个item里的不同类型的自控件
 *  4.滑动删除
 *  5.不同类型的item
 * Created by j on 2018/2/2.
 */

public class RecyclerViewActivity  extends BaseActivity{
    private RecyclerView mRecyclerView;
    private LinearLayoutManager layoutManager;
    private ItemAdapter mAdapter;
    List<String> mDatas = new ArrayList<>();


    private TranslateAnimation tAnim;
    private RotateAnimation rAnima;
    private ScaleAnimation sAnima;
    private AlphaAnimation aAnima;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recycler);
        initView();
    }

    private void initView() {
        // 确定起始状态，结束状态
        tAnim = new TranslateAnimation(0, 400, 0, 0);//横向位移400个单位
        rAnima = new RotateAnimation(0, 70);//顺时针旋转70度
        sAnima = new ScaleAnimation(0, 5, 0, 5);//横向放大5倍，纵向放大5倍
        aAnima = new AlphaAnimation(1.0f, 0.0f);//从全不透明变为全透明
        // 确定持续时间
        tAnim.setDuration(2000);
        rAnima.setDuration(2000);
        sAnima.setDuration(2000);
        aAnima.setDuration(2000);

        AnimationSet set=new AnimationSet(true);
        set.addAnimation(tAnim);
        set.addAnimation(rAnima);
        set.addAnimation(sAnima);
        set.addAnimation(aAnima);

        for (int i = 0;i<50;i++){
            mDatas.add("我的第"+i+"个Item");
        }


        mRecyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(RecyclerViewActivity.this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new MyItemDecoration());//添加分割线
        mRecyclerView.setAnimation(set);//;
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
    }
}
