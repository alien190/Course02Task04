package com.example.ivanovnv.course02task04;

import android.app.Application;

/**
 * Created by IvanovNV on 19.04.2018.
 */

/**
 * MyApplication class
 */
public class MyApplication extends Application {

    /**
     * override for initialize Singleton
     */
    @Override
    public void onCreate() {
        super.onCreate();
        Singleton.initInstance();
    }

    /**
     * override for destroying Singleton
     */
    @Override
    public void onTerminate() {
        Singleton.destroyInstance();
        super.onTerminate();
    }

}
