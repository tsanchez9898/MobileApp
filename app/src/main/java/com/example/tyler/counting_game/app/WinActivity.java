package com.example.tyler.counting_game.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WinActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);


    }
    public void onClickReset(View view) {
        //Reset to start game over
        startActivity(new Intent(this,  MainActivity.class));
    }
}