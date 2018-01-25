package com.android.learn.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.android.learn.BaseActivity;
import com.android.learn.R;

/**
 * Created by j on 2018/1/25.
 */

public class ViewAnimationActivity extends BaseActivity implements View.OnClickListener{

    private ImageView iv_alpha_animation,iv_rotate_animation,iv_scale_animation,iv_translate_animation;
    private Button  btn_alpha_animation, btn_rotate_animation, btn_scale_animation, btn_translate_animation;

    private AlphaAnimation aAnima;
    private RotateAnimation rAnima;
    private ScaleAnimation sAnima;
    private TranslateAnimation tAnima;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_view);
        initView();
        initData();
    }
    @Override
    public void initView() {

        iv_alpha_animation = findViewById(R.id.iv_alpha_animation);
        iv_rotate_animation = findViewById(R.id.iv_rotate_animation);
        iv_scale_animation = findViewById(R.id.iv_scale_animation);
        iv_translate_animation = findViewById(R.id.iv_translate_animation);

        btn_alpha_animation = findViewById(R.id.btn_alpha_animation);
        btn_rotate_animation = findViewById(R.id.btn_rotate_animation);
        btn_scale_animation = findViewById(R.id.btn_scale_animation);
        btn_translate_animation = findViewById(R.id.btn_translate_animation);

        btn_alpha_animation.setOnClickListener(this);
        btn_rotate_animation.setOnClickListener(this);
        btn_scale_animation.setOnClickListener(this);
        btn_translate_animation.setOnClickListener(this);
    }

    @Override
    public void initData() {
        // 确定起始状态，结束状态
        aAnima = new AlphaAnimation(1.0f, 0.0f);//从全不透明变为全透明
        rAnima = new RotateAnimation(0, 70);//顺时针旋转70度
        sAnima = new ScaleAnimation(0, 5, 0, 5);//横向放大5倍，纵向放大5倍
        tAnima = new TranslateAnimation(0, 400, 0, 0);//横向位移400个单位

        // 确定持续时间
        aAnima.setDuration(2000);
        rAnima.setDuration(2000);
        sAnima.setDuration(2000);
        tAnima.setDuration(2000);
    }





    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_alpha_animation:
                iv_alpha_animation.startAnimation(aAnima);
                break;
            case R.id.btn_rotate_animation:
                iv_rotate_animation.startAnimation(rAnima);
                break;
            case R.id.btn_scale_animation:
                iv_scale_animation.startAnimation(sAnima);
                break;
            case R.id.btn_translate_animation:
                iv_translate_animation.startAnimation(tAnima);
                break;
        }
    }
}
