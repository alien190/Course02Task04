package com.example.ivanovnv.course02task04;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class TextViewHolder extends BaseViewHolder {

    private TextView mTextView;

    public TextViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tv_item);
    }

    public void bind(final TextObject textObject){
        super.bind(textObject);
        mTextView.setText(textObject.getText());
    }
}
