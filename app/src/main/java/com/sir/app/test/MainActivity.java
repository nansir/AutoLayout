package com.sir.app.test;

import android.os.Bundle;

import com.sir.app.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
