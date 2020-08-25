package com.barmej.interactiveapp;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //   ArrayList<suggestions> sug = new ArrayList<>();

    private ImageView im;
    private Button bRandom;
    private ImageButton rButton;
    private ImageButton lButton;
    private TextView name;
    private Random mRandom;


    int[] sugPlace = {
            R.drawable.shop,
            R.drawable.beach,
            R.drawable.bike,
            R.drawable.football,
            R.drawable.museum,
            R.drawable.park,
            R.drawable.restaurant,
            R.drawable.running,
            R.drawable.swimming,
            R.drawable.walking
    };

    String[] sugName = {
            "shopping", "beach", "bike", "football", "museum", "park", "restaurant", "running", "swimming", "walking"
    };


    int currentIndex = 0;
    int currentIndexRandom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = (ImageView) findViewById(R.id.imageView);
        bRandom = (Button) findViewById(R.id.button);
        rButton = (ImageButton) findViewById(R.id.imageButton);
        lButton = (ImageButton) findViewById(R.id.imageButton2);
        name = (TextView) findViewById(R.id.textView);
        mRandom = new Random();



        showSug();



        bRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuffleSug();
            }
        });

        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        try {
            display1();
            display2();

            currentIndex++;

            if (currentIndexRandom == 9) {
                currentIndex = 0;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            currentIndex = 0;
        }
            }
        });

        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    display1();
                    display2();

                    currentIndex--;

                    if (currentIndex == 0) {
                        currentIndex = 9;
                    }
                }catch (ArrayIndexOutOfBoundsException e ){
                    currentIndex = 9;
                }
            }
        });


        bRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuffleSug();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("suggName" , String.valueOf(sugName));
        outState.putInt("suggPlace" , Integer.parseInt(String.valueOf(sugPlace)));

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //savedInstanceState.putString("suggName");
    }


    public void display1() {
        Drawable placeI = ContextCompat.getDrawable(this, sugPlace[currentIndex]);
        im.setImageDrawable(placeI);
    }


    public void display2() {
        String placeI2 = sugName[currentIndex];
        name.setText(placeI2);

    }

    public void shuffleSug(){
        currentIndexRandom = mRandom.nextInt(10);
        im.setImageResource(sugPlace[currentIndexRandom]);
        name.setText(sugName[currentIndexRandom]);

      //  Collections.shuffle(Arrays.asList(sugPlace , sugName));
    }

    public void showSug() {
        im.setImageResource(sugPlace[0]);
        name.setText(sugName[0]);
    }
}