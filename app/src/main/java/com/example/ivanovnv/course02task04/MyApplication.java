package com.example.ivanovnv.course02task04;

import android.app.Application;

/**
 * Created by IvanovNV on 19.04.2018.
 */


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Singleton.initInstance();
    }

    @Override
    public void onTerminate() {
        Singleton.destroyInstance();
        super.onTerminate();
    }

}
