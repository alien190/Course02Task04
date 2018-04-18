package com.example.ivanovnv.course02task04;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

class ImageViewHolder extends BaseViewHolder {
    private ImageView mImageView;

    public ImageViewHolder(View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.im_item);
    }

    public void bind(final ImageObject imageObject){
        super.bind(imageObject);
        mImageView.setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), imageObject.getId()));
    }
}
