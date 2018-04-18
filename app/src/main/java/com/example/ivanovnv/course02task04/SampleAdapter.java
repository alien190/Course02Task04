package com.example.ivanovnv.course02task04;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by IvanovNV on 18.04.2018.
 */

public class SampleAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

    private final int TEXT = 0;
    private final int IMAGE = 0;

    ArrayList<Object> mContent = new ArrayList<Object>(){{
        add(new TextObject("Первый элемент в списке"));
        add(new ImageObject(R.drawable.ic_sample_image));
        }};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder viewHolder;
        View view;

        switch (viewType) {
            case TEXT: {
                view = inflater.inflate(R.layout.li_text, parent, false);
                viewHolder = new ViewHolderText(view);
                break;
            }

            case IMAGE: {
                view = inflater.inflate(R.layout.li_image, parent, false);
                viewHolder = new ViewHolderImage(view);
                break;
            }
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (mContent.get(position) instanceof TextView) return TEXT;
        else return IMAGE;
    }
}
