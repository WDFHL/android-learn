package com.android.learn.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.learn.MainActivity;
import com.android.learn.R;
import com.android.learn.widget.WidgetActivity;

/**
 * Created by j on 2018/1/25.
 */

public class AnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }
    public void startViewAnimationActivity(View view){
        startActivity(new Intent(AnimationActivity.this, ViewAnimationActivity.class));
    }
    public void startDrawableAnimationActivity(View view){
        startActivity(new Intent(AnimationActivity.this, DrawableAnimationActivity.class));
    }
}
