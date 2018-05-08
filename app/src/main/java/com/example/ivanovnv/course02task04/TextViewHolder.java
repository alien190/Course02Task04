package com.example.ivanovnv.course02task04;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

/**
 * Text Holder class
 */
public class TextViewHolder extends BaseViewHolder {

    private TextView mTextView;
    private View mBgLayaut;


    /**
     * constructor
     * @param itemView - view
     */
    public TextViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tv_item);
        mBgLayaut = itemView.findViewById(R.id.cl_background);
    }

    /**
     * bind to text object
     * @param textObject - object to bind
     */
    public void bind(final TextObject textObject){
        super.bind(textObject);
        mTextView.setText(textObject.getText());
        mBgLayaut.setBackground(ContextCompat.getDrawable(itemView.getContext(), textObject.getId()));

    }
}
