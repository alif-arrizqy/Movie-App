package com.example.movies;

import android.widget.Button;

/**
 * Author by Alif Ayatulloh Ar-Rizqy, Time 8:04 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class Movie {
    private String Title, Sinopsis, Category, Genre;
    private int Image;

    public Movie() {
    }

    public Movie(String title, String sinopsis, String category, String genre, int image) {
        Title = title;
        Sinopsis = sinopsis;
        Category = category;
        Genre = genre;
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        Sinopsis = sinopsis;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
