package com.android.learn.dependency;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.android.learn.BaseActivity;
import com.android.learn.MainActivity;
import com.android.learn.R;

/**
 * Created by j on 2018/2/6.
 */

public class DependencyInjectionActivity  extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_injection);
    }

    public void startDagger2Activity(View view) {
        startActivity(new Intent(DependencyInjectionActivity.this, Dagger2Activity.class));
    }


    public void startButterknifeActivity(View view) {
        startActivity(new Intent(DependencyInjectionActivity.this, ButterknifeActivity.class));
    }
}
