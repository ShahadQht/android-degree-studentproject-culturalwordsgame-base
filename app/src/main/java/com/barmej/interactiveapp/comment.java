package com.barmej.interactiveapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class comment extends AppCompatActivity {
}
   /* String[] sugPlace = {
            "shopping", "beach", "bike", "football", "museum", "park", "restaurant", "running", "swimming", "walking"
    };

    int[] sugNames = {
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


        rButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            DisplayText(name);

            Display(im);
            currentIndex++;

            if (currentIndex == 8){
                currentIndex = 0;
            }
            if (currentIndex == -1){
                currentIndex = 8;
            }
        }
    });

        lButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            DisplayText(name);

            Display(im);
            currentIndex = currentIndex - 1 ;

            if (currentIndex == 0){
                currentIndex = 8;
            }
            if (currentIndex == -1){
                currentIndex = 8;
            }
        }
    });

        bRandom.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int [] suggestions = {
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

            String [] suggestionsNames = {
                    "shopping", "beach", "bike", "football", "museum", "park", "restaurant", "running", "swimming", "walking"

            };
            currentIndexRandom = 2;
            Random randomSug = new Random();
            int randomSugg = randomSug.nextInt(currentIndexRandom);
            int suggestion = suggestions[randomSugg];

            im.setImageResource(suggestion);

            Random randomNameSug = new Random();
            int randomNameSugg = randomNameSug .nextInt(currentIndexRandom);
            String suggestionName = suggestionsNames[randomNameSugg];
            name.setText(suggestionName);

        }
    });
}

   private void Display(View view) {
        Drawable placeI = ContextCompat.getDrawable(this, Integer.parseInt(sugPlace[currentIndex]));
         im.setImageDrawable(placeI);
    }

    public void DisplayText(View view){
        int placeNa = sugNames[currentIndex];
        name.setText(placeNa);
    }
}
 /*  private ImageView im;
    private Button bRandom;
    private ImageButton rButton;
    private ImageButton lButton;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = ( ImageView )findViewById(R.id.imageView);
        bRandom = (Button)findViewById(R.id.button);
        rButton = (ImageButton)findViewById(R.id.imageButton);
        lButton = (ImageButton)findViewById(R.id.imageButton2);
        name = (TextView)findViewById(R.id.textView);

        showSug();
        bRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuffleSug();
            }
        });
    }
    public void showSug(){
        im.setImageResource(sugArray[0].getImage());
        name.setText(sugArray[0].getSuggest());
        shuffleSug();

    }
    suggestions shopping = new suggestions("Shopping",R.drawable.shop);
    suggestions beach = new suggestions("Beach",R.drawable.beach);
    suggestions bike = new suggestions("Bike",R.drawable.bike);
    suggestions football = new suggestions("Football",R.drawable.football);
    suggestions museum = new suggestions("Museum",R.drawable.museum);
    suggestions park = new suggestions("Park",R.drawable.park);
    suggestions restaurant = new suggestions("Restaurant",R.drawable.restaurant);
    suggestions running = new suggestions("Running",R.drawable.running);
    suggestions swimming = new suggestions("Swimming",R.drawable.swimming);
    suggestions walking = new suggestions("Walking",R.drawable.walking);

    suggestions [] sugArray = new suggestions[]{
            shopping, beach, bike, football, museum, park, restaurant, running, swimming, walking
    };

    public void rightButton(){


    }

    public void shuffleSug(){
        // Collections.shuffle(Arrays.asList(sugArray));
        //showSug();

    }
}

   showSug();


            rButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rightButton();
                }
            });
            bRandom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    shuffleSug();
                }
            });
        }
        public void showSug(){
            im.setImageResource(sugArray[0].getImage());
            name.setText(sugArray[0].getSuggest());
            shuffleSug();

        }

        suggestions shopping = new suggestions("Shopping",R.drawable.shop);
        suggestions beach = new suggestions("Beach",R.drawable.beach);
        suggestions bike = new suggestions("Bike",R.drawable.bike);
        suggestions football = new suggestions("Football",R.drawable.football);
        suggestions museum = new suggestions("Museum",R.drawable.museum);
        suggestions park = new suggestions("Park",R.drawable.park);
        suggestions restaurant = new suggestions("Restaurant",R.drawable.restaurant);
        suggestions running = new suggestions("Running",R.drawable.running);
        suggestions swimming = new suggestions("Swimming",R.drawable.swimming);
        suggestions walking = new suggestions("Walking",R.drawable.walking);

        suggestions [] sugArray = new suggestions[]{
                shopping, beach, bike, football, museum, park, restaurant, running, swimming, walking
        };

        public void rightButton(){


            currentIndex++;

            if (currentIndex == 8){
                currentIndex = 0;
            }
            if (currentIndex == -1){
                currentIndex = 8;
            }


        }

        public void shuffleSug(){
            Collections.shuffle(Arrays.asList(sugArray));
            //showSug();

        }
    */


      /*  sug.add(shopping);
        sug.add(beach);
        sug.add(bike);
        sug.add(bike);
        sug.add(football);
        sug.add(museum);
        sug.add(park);
        sug.add(restaurant);
        sug.add(running);
        sug.add(swimming);
        sug.add(walking); */

