package com.example.ivanovnv.course02task04;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class TextObject extends ContentObject{

    private String mText;

    public TextObject(String mText) {
        super();
        this.mText = mText;
    }

    public String getText() {
        return mText;
    }
}
