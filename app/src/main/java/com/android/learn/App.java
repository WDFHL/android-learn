package com.android.learn;

import android.app.Application;

/**
 * Created by j on 2018/2/6.
 */

public class App extends Application {
    private static App instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        AppCrashHandler handler = AppCrashHandler.getInstance();
        handler.init(this);
    }

    public static App getInstance() {
        return instance;
    }
}
