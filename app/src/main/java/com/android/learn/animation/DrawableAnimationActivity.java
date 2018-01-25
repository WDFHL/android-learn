package com.android.learn.animation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.learn.R;

/**
 * Created by j on 2018/1/25.
 */

public class DrawableAnimationActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageView iv_animation_drawable;
    private Button btn_animation_start,btn_animation_stop;
    private AnimationDrawable mAnimationDrawable;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_drawable);
        iv_animation_drawable =  findViewById(R.id.iv_animation_drawable);

        btn_animation_start = findViewById(R.id.btn_animation_start);
        btn_animation_stop = findViewById(R.id.btn_animation_stop);

        iv_animation_drawable.setBackgroundResource(R.drawable.progress_drawable_white);
        mAnimationDrawable = (AnimationDrawable) iv_animation_drawable.getBackground();


        btn_animation_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_alpha_animation:
                mAnimationDrawable.start();
                break;
            case R.id.btn_rotate_animation:
                mAnimationDrawable.stop();
                break;
             default:
                break;
        }
    }
}

