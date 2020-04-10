package com.example.movies.model;

/**
 * Author by Alif Ayatulloh Ar-Rizqy, Time 8:04 PM, Date on 4/7/2020.
 * follow me on www.github.com/alif-arrizqy
 */
public class MovieModel {
    private String Title, Sinopsis, Category, Genre, VideoURL;
    private int Image;

    public MovieModel(String title, String sinopsis, String category, String genre, int image, String videoURL) {
        Title = title;
        Sinopsis = sinopsis;
        Category = category;
        Genre = genre;
        Image = image;
        VideoURL = videoURL;
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

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getVideoURL() {
        return VideoURL;
    }

    public void setVideoURL(String videoURL) {
        VideoURL = videoURL;
    }
}
