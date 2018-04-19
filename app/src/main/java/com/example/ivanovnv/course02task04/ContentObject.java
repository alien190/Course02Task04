package com.example.ivanovnv.course02task04;

import java.util.Calendar;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Superclass for content object
 */
public class ContentObject {

    private String mTimeStamp;

    /**
     * constructor - generate timestamp
     */
    public ContentObject() {
        Calendar rightNow= Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR);
        int min = rightNow.get(Calendar.MINUTE);
        int sec = rightNow.get(Calendar.SECOND);

        this.mTimeStamp = "" + (hour < 10 ? "0" + hour : hour) + ":"
                             + (min < 10 ? "0" + min : min) + ":"
                             + (sec < 10 ? "0" + sec : sec);
    }

    /**
     * return timestamp when object was generated
     * @return - timestamp
     */
    public String getTimeStamp() {
        return mTimeStamp;
    }
}
