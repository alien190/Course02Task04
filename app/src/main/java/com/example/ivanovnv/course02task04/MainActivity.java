package com.example.ivanovnv.course02task04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * MainActivity class
 */
public class MainActivity extends AppCompatActivity {

    /**
     * when creates
     * @param savedInstanceState - savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, RecycleFragment.newInstance())
            .commit();
        }
    }
}
