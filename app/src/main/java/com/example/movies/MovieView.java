package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Author by Alif Ayatulloh Ar-Rizqy,Time on 9:11 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class MovieView extends AppCompatActivity {
    private TextView title, category, genre, sinopsis;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_view);

        title = findViewById(R.id.title_MovieView);
        category = findViewById(R.id.category_MovieView);
        genre = findViewById(R.id.genre_MovieView);
        sinopsis = findViewById(R.id.sinopsis_movieView);
        img = findViewById(R.id.img_MovieView);

        //penerima data
        Intent intent = getIntent();

        String intent_title = intent.getExtras().getString("Title");
        String intent_category = intent.getExtras().getString("Category");
        String intent_genre = intent.getExtras().getString("Genre");
        String intent_sinopsis = intent.getExtras().getString("Sinopsis");
        int intent_image = intent.getExtras().getInt("Image");

        //set value
        title.setText(intent_title);
        category.setText(intent_category);
        genre.setText(intent_genre);
        sinopsis.setText(intent_sinopsis);
        img.setImageResource(intent_image);
    }
}
