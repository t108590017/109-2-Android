package com.example.hw4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mZero;
    private Button mbuttonC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        if(savedInstanceState != null){
            mShowCount.setText(savedInstanceState.getString("Count_Text"));
            mCount = savedInstanceState.getInt("Count");
        }
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if(mShowCount != null){
            outState.putString("Count_Text",mShowCount.getText().toString());
        }
        if(mCount != 0){
            outState.putInt("Count",mCount);
        }
    }

}