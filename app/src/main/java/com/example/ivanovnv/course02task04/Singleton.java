package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 19.04.2018.
 */

class Singleton {
    private static Singleton instance;
    private SampleAdapter mSampleAdapter = null;

    private Singleton() {
        mSampleAdapter = new SampleAdapter();
    }

    public SampleAdapter getSampleAdapter() {
        return mSampleAdapter;
    }

    public static Singleton initInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void destroyInstance() {
        if (instance != null) {
            instance.onDestroy();
        }
    }

    private void onDestroy() {
        mSampleAdapter = null;
    }

    public static Singleton getInstance() {
        return instance;
    }
}
