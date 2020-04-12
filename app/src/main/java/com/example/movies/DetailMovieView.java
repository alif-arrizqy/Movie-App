package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Author by Alif Ayatulloh Ar-Rizqy,Time on 9:11 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class DetailMovieView extends AppCompatActivity implements View.OnClickListener {
    private TextView title, category, genre, sinopsis;
    private ImageView img;
    private Button btn_trailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_view);

        title = findViewById(R.id.title_MovieView);
        category = findViewById(R.id.category_MovieView);
        genre = findViewById(R.id.genre_MovieView);
        sinopsis = findViewById(R.id.sinopsis_movieView);
        img = findViewById(R.id.img_MovieView);
        btn_trailer = findViewById(R.id.btn_trailer);
        btn_trailer.setOnClickListener(this);

        Intent intent = getIntent();
        if (intent != null) {
            String intent_title = intent.getExtras().getString("Title");
            String intent_category = intent.getExtras().getString("Category");
            String intent_genre = intent.getExtras().getString("Genre");
            String intent_sinopsis = intent.getExtras().getString("Sinopsis");
            int intent_image = intent.getExtras().getInt("Image");
            String intent_videourl = intent.getExtras().getString("VideoURL");

            title.setText(intent_title);
            category.setText(intent_category);
            genre.setText(intent_genre);
            sinopsis.setText(intent_sinopsis);
            img.setImageResource(intent_image);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle((intent_title));
        }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_trailer:
                String webPage = getIntent().getExtras().getString("VideoURL");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(webPage));
                startActivity(webIntent);
            Toast.makeText(this, "Kamu memutar trailer!", Toast.LENGTH_LONG).show();
        }
    }
}
