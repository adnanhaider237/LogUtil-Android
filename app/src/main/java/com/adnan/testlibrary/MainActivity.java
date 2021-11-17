package com.adnan.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.adnan.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    LogDebug log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}