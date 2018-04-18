package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class ImageObject extends ContentObject{
   private int mId;

    public ImageObject(int mId) {
        super();
        this.mId = mId;
    }

    public int getId() {
        return mId;
    }
}
