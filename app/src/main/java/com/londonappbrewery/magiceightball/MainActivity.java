package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image8Ball = (ImageView) findViewById(R.id.image8Ball);

       final int[] imageBallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        Button buttonAsk = (Button) findViewById(R.id.buttonAsk);
        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("8Ball Ask","The button is working");
                Random randomNumberGenerator = new Random();
                int numberAsk = randomNumberGenerator.nextInt(4);
                Log.d("8Ball Random","Random number = " + numberAsk);
                image8Ball.setImageResource(imageBallArray[numberAsk]);
            }
        });
    }
}
