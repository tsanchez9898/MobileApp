package com.example.tyler.counting_game.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoseActivity extends AppCompatActivity {

    ImageView image;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        image = (ImageView) findViewById(R.id.lose_image);

    }
    public void onClickReset(View view) {

        //Reset to start game over
        Intent intent =  new Intent (this, MainActivity.class);
        startActivity(intent);
        }

    }
