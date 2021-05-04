package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello debug");
        Log.v("MainActivity", "Hello Verbose");
        Log.w("MainActivity", "Hello Warn");
        Log.i("MainActivity", "Hello info");
        Log.e("MainActivity", "Hello Error");
        Log.i("MainActivity", "MainActivity layout is complete");
    }
}