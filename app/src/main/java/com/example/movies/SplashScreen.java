package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.movies.datalocal.DataMovie;

/**
 * Author by Alif Ayatulloh Ar-Rizqy,Time on 6:57 PM, Date on 4/9/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, DataMovie.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}
