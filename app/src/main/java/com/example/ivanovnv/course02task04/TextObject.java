package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Class for storing text dates
 */
public class TextObject extends ContentObject{

    private String mText;
    private int mId;

    /**
     * constructor
     * @param mText - string to store
     */
    public TextObject(String mText, int mId) {
        super();
        this.mText = mText;
        this.mId = mId;
    }

    /**
     * return stored text
     * @return - text
     */
    public String getText() {
        return mText;
    }

    /**
     * return stored image id for background
     * @return
     */
    public int getId() {
        return mId;
    }
}
