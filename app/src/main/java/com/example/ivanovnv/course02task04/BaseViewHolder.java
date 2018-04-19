package com.example.ivanovnv.course02task04;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Superclass for ViewColder's
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;
    private ContentObject mContentObject;

    /**
     * constructor
     * @param itemView - view
     */
    public BaseViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tv_timestamp);
    }

    /**
     * bind to object
     * @param object - object to bind
     */
    public void bind(final ContentObject object){
        mTextView.setText(object.getTimeStamp());
        mContentObject = object;
    }

    /**
     * set listener for callbacks
     * @param listener - listener
     */
    public void setListener(final OnItemClickListener listener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(mContentObject);
            }
        });
    }

    /**
     * interface for Item click listener
     */
    interface OnItemClickListener {
        void onItemClick (ContentObject object);
    }
}
