package com.pillartechnology.visualizer;

import android.os.Bundle;
import android.widget.TextView;

class MainActivityImpl {

    private MainActivity qtn;

    public MainActivityImpl(MainActivity qtn) {
        this.qtn = qtn;
    }

    public void onCreate(Bundle savedInstanceState) {
        TextView mainTextView = qtn.findViewById(R.id.main_text);
        mainTextView.setText("Bigfoot was here");
    }

}
