package com.sir.app.test;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.sir.app.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView toolTitle = (TextView) findViewById(R.id.toolbar_title);
        toolTitle.setText(getTitle());
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
