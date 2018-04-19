package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Class foe storing images id's
 */
public class ImageObject extends ContentObject{
   private int mId;

    /**
     * constructor
     * @param mId - image id
     */
    public ImageObject(int mId) {
        super();
        this.mId = mId;
    }

    /**
     * return sored image id
     * @return - image id
     */
    public int getId() {
        return mId;
    }
}
