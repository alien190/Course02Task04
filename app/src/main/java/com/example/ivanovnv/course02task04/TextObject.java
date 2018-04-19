package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Class for storing text dates
 */
public class TextObject extends ContentObject{

    private String mText;

    /**
     * constructor
     * @param mText - string to store
     */
    public TextObject(String mText) {
        super();
        this.mText = mText;
    }

    /**
     * return stored text
     * @return - text
     */
    public String getText() {
        return mText;
    }
}
