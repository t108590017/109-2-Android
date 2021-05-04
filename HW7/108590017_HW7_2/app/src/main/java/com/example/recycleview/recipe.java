package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Console;

public class recipe extends AppCompatActivity {
    private ImageView mShowImage;
    private TextView mShowContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        int data = getIntent().getIntExtra("position", 0);
        mShowImage = findViewById(R.id.RecipeImage);
        mShowContent = findViewById(R.id.RecipeText);
        switch (data) {
            case 0:
                mShowContent.setText(R.string.recipe0);
                mShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup1));
                break;
            case 1:
                mShowContent.setText(R.string.recipe1);
                mShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup2));
                break;
            case 2:
                mShowContent.setText(R.string.recipe2);
                mShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup3));
                break;
            case 3:
                mShowContent.setText(R.string.recipe3);
                mShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup4));
                break;
            case 4:
                mShowContent.setText(R.string.recipe4);
                mShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup5));
                break;
            case 5:
                mShowContent.setText(R.string.recipe5);
                mShowImage.setImageDrawable(getResources().getDrawable(R.drawable.soup6));
                break;
            default:
                mShowContent.setText("nothing");
                break;
        }
    }
}