package com.barmej.culturalwords;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;



public class ShareActivity extends AppCompatActivity {


    private EditText mEditTextShareTitle;
    private ImageView currentPic;
    public int[] pic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mEditTextShareTitle = findViewById(R.id.edit_text_share_title);
        currentPic = findViewById(R.id.image_view_question);

        Bundle bundle = getIntent().getExtras();
        int currentIndexRandom = bundle.getInt("shImage");
        currentPic.setImageResource(currentIndexRandom);


        SharedPreferences sharedPreferences = getSharedPreferences("APP PREF", MODE_PRIVATE);
        String questionTitle = sharedPreferences.getString("SHARE TITLE", "");
        mEditTextShareTitle.setText(questionTitle);



    }
    public void onShareQuestionClicked(View view) {

        String questionTitle = mEditTextShareTitle.getText().toString();
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");

        shareIntent.putExtra(Intent.EXTRA_TEXT, questionTitle + "\n" + pic);
        startActivity(shareIntent);

        SharedPreferences sharedPreferences = getSharedPreferences("APP PREF", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("SHARE TITLE", questionTitle);
        editor.apply();
    }
}


