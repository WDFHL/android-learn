package com.android.learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.learn.animation.AnimationActivity;
import com.android.learn.dependency.DependencyInjectionActivity;
import com.android.learn.loadpic.LoadPicActivity;
import com.android.learn.net.activity.NetWorkActivity;
import com.android.learn.pic.PicActivity;
import com.android.learn.widget.WidgetActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startWidgetActivity(View view){
        startActivity(new Intent(MainActivity.this, WidgetActivity.class));
}
    public  void startAnimationActivity(View view){
        startActivity(new Intent(MainActivity.this, AnimationActivity.class));
    }


    public void startNetWorkActivity(View view) {
        startActivity(new Intent(MainActivity.this, NetWorkActivity.class));
    }

    public void starPicActivity(View view) {
        startActivity(new Intent(MainActivity.this, PicActivity.class));
    }

    public void starLoadPicActivity(View view) {
        startActivity(new Intent(MainActivity.this, LoadPicActivity.class));
    }

    public void startDependencyInjectionActivity(View view) {
        startActivity(new Intent(MainActivity.this, DependencyInjectionActivity.class));
    }
}
