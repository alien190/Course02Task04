package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 19.04.2018.
 */

/**
 * Singleton for store Adapter
 */
class Singleton {
    private static Singleton instance;
    private SampleAdapter mSampleAdapter = null;

    /**
     * constructor
     */
    private Singleton() {
        mSampleAdapter = new SampleAdapter();
    }

    /**
     * return instance of Adapter
     * @return - SampleAdapter
     */
    public SampleAdapter getSampleAdapter() {
        return mSampleAdapter;
    }

    /**
     * initialize instance of Singleton
     * @return - instance
     */
    public static Singleton initInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * destroy instance
     */
    public static void destroyInstance() {
        if (instance != null) {
            instance.onDestroy();
        }
    }

    /**
     * destroy instance
     */
    private void onDestroy() {
        mSampleAdapter = null;
    }


    /**
     * get instance
     * @return - instance
     */
    public static Singleton getInstance() {
        return instance;
    }
}
