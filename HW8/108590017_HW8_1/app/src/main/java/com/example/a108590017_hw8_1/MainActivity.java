package com.example.a108590017_hw8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int mScore1;
    private int i=0;
    private ImageView mBattery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBattery = (ImageView) findViewById(R.id.imageView);
    }
    public void decreaseScore(View view) {
        i--;
        if (i<0)
            i=0;
        mBattery.setImageLevel(i);
    }
    public void increaseScore(View view) {
        i++;
        if (i>6)
            i=6;
        mBattery.setImageLevel(i);
    }
}
