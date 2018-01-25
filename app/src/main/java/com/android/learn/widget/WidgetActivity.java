package com.android.learn.widget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.learn.MainActivity;
import com.android.learn.R;
import com.android.learn.widget.activity.AppBarLayoutActivity;

/**
 * Created by j on 2018/1/25.
 */

public class WidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
    }
    public void startAppBarLayoutActivity(View view){
        startActivity(new Intent(WidgetActivity.this, AppBarLayoutActivity.class));
    }


}