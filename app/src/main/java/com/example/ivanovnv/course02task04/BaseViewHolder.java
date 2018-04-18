package com.example.ivanovnv.course02task04;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tv_timestamp);
    }

    public void bind(final ContentObject object){
        mTextView.setText(object.getTimeStamp());
    }
}
