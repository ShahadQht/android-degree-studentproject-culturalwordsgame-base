package com.barmej.culturalwords;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class AnswerActivity extends AppCompatActivity {


    private TextView answer;
    private Button bBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answer = (TextView) findViewById(R.id.text_view_answer);
        bBack = (Button) findViewById(R.id.button_return);

        Intent i = getIntent();
        String answerQ = i.getStringExtra("cAnswer");

     //   if (answerQ != null){
          answer.setText(answerQ);
        //}

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
          }
        });

       }
   }
