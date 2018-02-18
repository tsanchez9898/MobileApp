package com.example.tyler.counting_game.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private int r1, r2;
    private int tries = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call method
        giveNewNumber();
    }

    private void giveNewNumber(){

        //Give 15 click max
        //Display winning screen if count is 10
        if(count == 10){
            Intent intent = new Intent(this, WinActivity.class);
            finish();
            startActivity(intent);
        }
        if (tries == 15){
            Intent intent =  new Intent (this, LoseActivity.class);
            finish();
            startActivity(intent);
        }
        else {
            //Generate two random numbers
            Random rand = new Random();
            r1 = rand.nextInt(10);
            while (true) {
                r2 = rand.nextInt(10);
                if (r1 != r2) break;
            }

            //Assign random numbers to each button
            Button b = (Button) findViewById(R.id.btnleft);
            b.setText(Integer.toString(r1));

            Button b2 = (Button) findViewById(R.id.btnright);
            b2.setText(Integer.toString(r2));
        }
    }

    //Handler for left button
    public void onClickLeft(View view) {

        //Check to see btnleft number is
        //greater than btnright
        if(r1 > r2)

            count++;

        else
            count--;

            //Displpay new count
            TextView textView = (TextView) findViewById(R.id.txtPoints);
            textView.setText("Points: " + count);

            //call mehtod
            tries++;
            giveNewNumber();


    }
    //Handler for the right button
    public void onClickRight(View view) {

        //Check to see btnright number is
        //greater than btnleft
        if(r1 < r2)
            count++;

        else
            count--;

            //Display new count
            TextView textView = (TextView) findViewById(R.id.txtPoints);
            textView.setText("Points: " + count);

            //call mehtod
            giveNewNumber();
            tries++;
    }
}

