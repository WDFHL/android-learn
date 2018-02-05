package com.android.learn.animation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.learn.R;

/**
 * Created by j on 2018/1/25.
 */

public class DrawableAnimationActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageView iv_animation_drawable,iv_loading_drawable,iv_load_drawable;
    private Button btn_animation_start,btn_animation_stop,btn_loading_start,btn_loading_stop,btn_load_start,btn_load_stop;
    private AnimationDrawable mAnimationDrawable,mAnimationDrawable2;
    private Animation mRotateAnimation;//声明Animation类的对象

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
        btn_animation_stop.setOnClickListener(this);

        iv_loading_drawable = findViewById(R.id.iv_loading_drawable);
        btn_loading_start = findViewById(R.id.btn_loading_start);
        btn_loading_stop = findViewById(R.id.btn_loading_stop);
        iv_loading_drawable.setBackgroundResource(R.drawable.progress_drawable_loading);
        mAnimationDrawable2 = (AnimationDrawable) iv_loading_drawable.getBackground();
        btn_loading_start.setOnClickListener(this);
        btn_loading_stop.setOnClickListener(this);

         iv_load_drawable = findViewById(R.id.iv_load_drawable);
         btn_load_start = findViewById(R.id.btn_load_start);
         btn_load_stop = findViewById(R.id. btn_load_stop);
        btn_load_start.setOnClickListener(this);
        btn_load_stop.setOnClickListener(this);
        iv_load_drawable.setImageResource(R.mipmap.load);
        mRotateAnimation = new RotateAnimation(0f, 360f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        mRotateAnimation.setRepeatCount(Integer.MAX_VALUE);
        mRotateAnimation.setDuration(1000);
        mRotateAnimation.setInterpolator(new LinearInterpolator());//设置动画匀速改变。相应的还有AccelerateInterpolator、DecelerateInterpolator、CycleInterpolator等
        //iv_load_drawable.setAnimation(mRotateAnimation);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_animation_start:
                mAnimationDrawable.start();
                break;
            case R.id.btn_animation_stop:
                mAnimationDrawable.stop();
                break;
            case R.id.btn_loading_start:
                mAnimationDrawable2.start();
                    break;
            case R.id.btn_loading_stop:
                mAnimationDrawable2.stop();
                    break;
            case R.id.btn_load_start:
                iv_load_drawable.startAnimation(mRotateAnimation);
                break;
            case R.id.btn_load_stop:
                iv_load_drawable.clearAnimation();
                break;

             default:
                break;
        }
    }
}

