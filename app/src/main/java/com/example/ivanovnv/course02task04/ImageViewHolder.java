package com.example.ivanovnv.course02task04;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Image holder class
 */
class ImageViewHolder extends BaseViewHolder {
    private ImageView mImageView;

    /**
     * constructor
     * @param itemView - view
     */
    public ImageViewHolder(View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.im_item);
    }


    /**
     * bind to image object and extract image from resource
     * @param imageObject - object to bind
     */
    public void bind(final ImageObject imageObject){
        super.bind(imageObject);
        try {
            mImageView.setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), imageObject.getId()));
        }
        catch (Throwable t)
        {
            t.printStackTrace();
            mImageView.setImageDrawable(null);
        }
    }
}
