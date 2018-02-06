package com.android.learn.dependency;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.learn.BaseActivity;
import com.android.learn.R;

import java.util.List;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindBool;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindFloat;
import butterknife.BindInt;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by j on 2018/2/6.
 */

public class ButterknifeActivity extends BaseActivity {
    @BindView(R.id.iv_one)
    ImageView ivOne;
    @BindView(R.id.btn_one)
    Button btnOne;
    @BindView(R.id.iv_two)
    ImageView ivTwo;
    @BindView(R.id.btn_two)
    Button btnTwo;
    @BindView(R.id.iv_three)
    ImageView ivThree;
    @BindView(R.id.btn_three)
    Button btnThree;

    //注解类型
    //绑定多个view
    @BindViews({ R.id.tv_one, R.id.tv_two,  R.id.tv_three})
    public List<TextView> tvlist;

    //绑定string里面array数组；
    @BindArray(R.array.city )
    String[] citys ;

    //绑定图片资源为Bitmap；
    @BindBitmap(R.mipmap.ic_launcher )
    Bitmap bitmap;

    //绑定boolean值
    @BindBool(R.bool.check)
    boolean isCheck;

    //绑定color
    @BindColor(R.color.colorAccent)
    int black ;  //绑定一个颜色值

    //绑定Dimen
    @BindDimen(R.dimen.dp_20)
    int mBorderWidth;

    //绑定Drawable；
    @BindDrawable(R.drawable.ic_launcher_background)
    Drawable mTestPic;

    @BindString(R.string.app_name)
    String title;

//    @BindFloat(R.dimen.dpf_20)
//    Float aFloat;

//    @BindInt(R.int.)
//    int anInt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        //绑定activity
        //在Activity 类中绑定 ：ButterKnife.bind(this);必须在setContentView();之后绑定；且父类bind绑定后，子类不需要再bind。
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_one, R.id.btn_two, R.id.btn_three})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                break;
            case R.id.btn_two:
                break;
            case R.id.btn_three:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在Activity中不需要做解绑操作，在Fragment 中必须在onDestroyView()中做解绑操作。
    }
}
