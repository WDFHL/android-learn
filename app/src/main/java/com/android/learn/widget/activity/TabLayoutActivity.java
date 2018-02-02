package com.android.learn.widget.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.learn.BaseActivity;
import com.android.learn.R;

/**
 * Created by j on 2018/2/2.
 */

public class TabLayoutActivity extends BaseActivity {
    private TabLayout mTabLayout,
                        mIconTabLayout,
                        mSTabLayout,
                        mFTabLayout,
                        mPTabLayout,
                        mFPTabLayout,
                        mWTabLayout,
                        mMTablayout;
    private String[] titles = { "Tab 1", "Tab 2","Tab 3","Tab 4","Tab 5"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_tab);
        initView();
        initData();


    }
    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        for (int i = 0;i<titles.length;i++){
            mTabLayout.addTab(mTabLayout.newTab().setText(titles[i]));
        }

        mIconTabLayout = findViewById(R.id.icon_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mIconTabLayout.addTab(mIconTabLayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }

       mSTabLayout = findViewById(R.id.scrollable_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mSTabLayout.addTab(mSTabLayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }

        mFTabLayout = findViewById(R.id.fixed_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mFTabLayout.addTab(mFTabLayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }

        mPTabLayout = findViewById(R.id.padding_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mPTabLayout.addTab(mPTabLayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }

        mFPTabLayout = findViewById(R.id.fill_padding_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mFPTabLayout.addTab(mFPTabLayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }


        mWTabLayout = findViewById(R.id.width_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mWTabLayout.addTab(mWTabLayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }
        mMTablayout = findViewById(R.id.margin_tabLayout);
        for (int i = 0;i<titles.length;i++){
            mMTablayout.addTab(mMTablayout.newTab().setText(titles[i]).setIcon(R.mipmap.ic_launcher));
        }
    }
    private void initData() {
    }



}
