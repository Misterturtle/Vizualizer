package com.pillartechnology.visualizer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityImpl mainActivityImpl = new MainActivityImpl(this);
        mainActivityImpl.onCreate(savedInstanceState);
    }

}
