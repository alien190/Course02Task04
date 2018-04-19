package com.example.ivanovnv.course02task04;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Created by IvanovNV on 18.04.2018.
 */

public class SampleAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder> implements BaseViewHolder.OnItemClickListener {

    public final static int TEXT = 1;
    public final static int IMAGE = 2;

    private String[] mTextRes = null;
    private int[] mImgRes = null;
    private Random mRandom = new Random();

    private ArrayList<Object> mContent = new ArrayList<>();
    private Lock mLock = new ReentrantLock();
    private boolean mIsInitialized = false;


    public void addInitialContent() {
        addItem(TEXT);
        addItem(IMAGE);
        mIsInitialized = true;
    }

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
        ((BaseViewHolder)holder).setListener(this);
    }

    @Override
    public int getItemCount() {
        int count = 0;
        mLock.lock();
        try {
            count = mContent.size();
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            mLock.unlock();
        }
        return count;
    }

    @Override
    public int getItemViewType(int position) {
        if (mContent.get(position) instanceof TextObject) return TEXT;
        else return IMAGE;
    }

    private Object generateRandomContentItem(int typeOfContent){

        Object retObject = null;

            switch (typeOfContent) {
                case TEXT: {
                    if(mTextRes!= null) {
                        retObject = new TextObject(mTextRes[mRandom.nextInt(mTextRes.length)]);
                    }

                    break;
                }

                case IMAGE: {
                    if(mImgRes != null) {
                        retObject = new ImageObject(mImgRes[mRandom.nextInt(mImgRes.length)]);
                    }
                    break;
                }

                default: {
                    if(mImgRes != null && mTextRes != null) {
                        int index = mRandom.nextInt(mImgRes.length + mTextRes.length);
                        if(index >= mImgRes.length) {
                            index -= mImgRes.length;
                            retObject = new TextObject(mTextRes[index]);
                        } else {
                            retObject = new ImageObject(mImgRes[index]);
                        }
                    }
                    break;
                }
            }
        return retObject;
    }

    public void setResources(String[] strings, int[] ints){
        if(mTextRes != null) {mTextRes = null;}
        mTextRes = strings;

        if(mImgRes != null) {mImgRes = null;}
        mImgRes = ints;
    }

    public boolean addItem (int itemType) {

        Object object = generateRandomContentItem(itemType);
        if (object != null) {
            mContent.add(object);
            this.notifyItemInserted(mContent.size()-1);
            return true;
        }
        return false;
    }


    @Override
    public void onItemClick(ContentObject object) {

        int index = mContent.indexOf(object);
        if(index != -1) {
            mLock.lock();
            try {
                mContent.remove(object);
                this.notifyItemRemoved(index);
            } catch (Throwable t) {
                t.printStackTrace();
            } finally {
                mLock.unlock();
            }
        }

    }

    public boolean isInitialized() {
        return mIsInitialized;
    }
}
