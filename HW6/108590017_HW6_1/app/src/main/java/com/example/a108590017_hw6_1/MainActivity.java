package com.example.a108590017_hw6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox mChocolateCyrup;
    private CheckBox mSprinkles;
    private CheckBox mCrushedNuts;
    private CheckBox mCherries;
    private CheckBox mcheckBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChocolateCyrup = (CheckBox) findViewById(R.id.ChocolateCyrup);
        mSprinkles = (CheckBox) findViewById(R.id.Sprinkles);
        mCrushedNuts = (CheckBox) findViewById(R.id.CrushedNuts);
        mCherries = (CheckBox) findViewById(R.id.Cherries);
        mcheckBox5 = (CheckBox) findViewById(R.id.checkBox5);


    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }


    public void onButtonClicked(View view) {
        String ToastS="Toppings:";
        if (mChocolateCyrup.isChecked())
            ToastS=ToastS+" Chocolate Cyrup";
        if (mSprinkles.isChecked())
            ToastS=ToastS+" Sprinkles";
        if (mCrushedNuts.isChecked())
            ToastS=ToastS+" Crushed Nuts";
        if (mCherries.isChecked())
            ToastS=ToastS+" Cherries";
        if (mcheckBox5.isChecked())
            ToastS=ToastS+" Orio Cookie Crumbles";
        displayToast(ToastS);
    }
}