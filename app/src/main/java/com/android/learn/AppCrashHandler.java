package com.android.learn;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

/**
 * Created by JuQiu
 * on 2016/9/13.
 */

public class AppCrashHandler implements Thread.UncaughtExceptionHandler {
    public static final String TAG = "CrashHandler";

    private Thread.UncaughtExceptionHandler mDefaultHandler;
    private static AppCrashHandler INSTANCE = new AppCrashHandler();
    private Context mContext;

    private AppCrashHandler() {
    }

    public static AppCrashHandler getInstance() {
        return INSTANCE;
    }

    public void init(Context context) {
        mContext = context;
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        if (!handleException(ex) && mDefaultHandler != null) {
            mDefaultHandler.uncaughtException(thread, ex);
        } else {
           /* android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);*/

        }
    }

    private boolean handleException(final Throwable ex) {
        if (ex == null) {
            return false;
        }
        ex.printStackTrace();

        new Thread() {
            @Override
            public void run() {
                Looper.prepare();
                //ex.toString()
//                Toast.makeText(mContext, "应用异常关闭", Toast.LENGTH_LONG).show();
                Toast.makeText(mContext, ex.toString(), Toast.LENGTH_LONG).show();
                Looper.loop();
            }
        }.start();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return true;
    }
}
