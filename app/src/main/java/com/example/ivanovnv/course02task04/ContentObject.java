package com.example.ivanovnv.course02task04;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class ContentObject {

    private String mTimeStamp;

    public void ContentObject() {

        Calendar rightNow= Calendar.getInstance();
        this.mTimeStamp = "" + rightNow.get(Calendar.HOUR) + ":" + rightNow.get(Calendar.MINUTE);
    }


    public String getTimeStamp() {
        return mTimeStamp;
    }
}
