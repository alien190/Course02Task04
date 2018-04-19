package com.example.ivanovnv.course02task04;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by IvanovNV on 18.04.2018.
 */

public class RecycleFragment extends Fragment {

    private ImageButton mButtonAddText;
    private ImageButton mButtonAddImage;
    private RecyclerView mRecycle;
    private SampleAdapter mSampleAdapter = new SampleAdapter();

    public static RecycleFragment newInstance() {
        return new RecycleFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fr_recycle, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mButtonAddText = view.findViewById(R.id.bt_add_text);
        mButtonAddImage = view.findViewById(R.id.bt_add_image);

        // get images id from resource array
        TypedArray imgs = getResources().obtainTypedArray(R.array.Images);
        int[] imgsId = new int[imgs.length()];
            for (int i = 0; i < imgs.length(); i++) {
                imgsId[i] = imgs.getResourceId(i, -1);
            }
        imgs.recycle();

        mSampleAdapter.setResourses(getResources().getStringArray(R.array.TextMessages), imgsId);

        mSampleAdapter.addInitialContent();

        mRecycle = view.findViewById(R.id.recycle);
        mRecycle.setLayoutManager(new LinearLayoutManager(view.getContext()));
        mRecycle.setAdapter(mSampleAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();

        mButtonAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButtonAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onStop() {
        mButtonAddText.setOnClickListener(null);
        mButtonAddImage.setOnClickListener(null);

        super.onStop();
    }

    @Override
    public void onDestroy() {
        mButtonAddText = null;
        mButtonAddImage = null;
        mRecycle = null;

        super.onDestroy();
    }
}
