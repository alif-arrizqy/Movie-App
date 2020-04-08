package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    private VideoView videoV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoV = findViewById(R.id.videoView);
        videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.trollsworldtour));
        videoV.setMediaController(new MediaController(this));
        videoV.requestFocus();
        videoV.start();
    }

    public void onConfigurasionChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }
}
