package com.android.learn.dependency;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.learn.BaseActivity;
import com.android.learn.R;

/**
 * Created by j on 2018/2/6.
 */

public class Dagger2Activity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2);
    }
}
