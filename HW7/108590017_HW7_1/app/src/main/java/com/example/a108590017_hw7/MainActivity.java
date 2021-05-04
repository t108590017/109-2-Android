package com.example.a108590017_hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void launchThirdActivity(View view) {
        Intent intent2 = new Intent(this, ThirdActivity.class);
        startActivity(intent2);
    }
    public void launchFourthActivity(View view) {
        Intent intent3 = new Intent(this, FourthActivity.class);
        startActivity(intent3);
    }

}