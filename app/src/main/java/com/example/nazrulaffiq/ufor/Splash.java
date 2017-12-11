package com.example.nazrulaffiq.ufor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by nazrulaffiq on 11/12/2017.
 */

public class Splash extends AppCompatActivity {
    long Delay = 2000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Get the view from splash_screen.xml
        setContentView(R.layout.splash);

        // Create a Timer
        Timer RunSplash = new Timer();

        // Task to do when the timer ends
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                // Close SplashScreenActivity.class
                finish();

                // Start MainActivity.class
                Intent myIntent = new Intent(Splash.this,
                        LoginActivity.class);
                startActivity(myIntent);
            }
        };

        // Start the timer
        RunSplash.schedule(ShowSplash, Delay);
    }

}
