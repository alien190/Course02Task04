package com.example.ivanovnv.course02task04;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class ViewHolderText extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public ViewHolderText(View itemView) {
        super(itemView);

        mTextView = itemView.findViewById(R.id.li_text_text);
    }


}
