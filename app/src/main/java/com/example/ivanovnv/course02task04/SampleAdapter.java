package com.example.ivanovnv.course02task04;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * Created by IvanovNV on 18.04.2018.
 */

public class SampleAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

    private final int TEXT = 0;
    private final int IMAGE = 1;

    private ArrayList<Object> mContent = new ArrayList<Object>(){{
        add(new TextObject("Это очень-очень длинный текст здесь для того что бы показать многострочное сообщение"));
        add(new ImageObject(R.drawable.sample_image));
        add(new TextObject("Кор. текст"));
        }};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder viewHolder;
        View view;

        switch (viewType) {
            case TEXT: {
                view = inflater.inflate(R.layout.li_text, parent, false);
                viewHolder = new TextViewHolder(view);
                break;
            }

            case IMAGE: {
                view = inflater.inflate(R.layout.li_image, parent, false);
                viewHolder = new ImageViewHolder(view);
                break;
            }
            default: {
                viewHolder = null;
            }
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case TEXT:{
                ((TextViewHolder)holder).bind((TextObject) mContent.get(position));
                break;
            }
            case IMAGE:{
                ((ImageViewHolder)holder).bind((ImageObject) mContent.get(position));
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return mContent.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mContent.get(position) instanceof TextObject) return TEXT;
        else return IMAGE;
    }
}
