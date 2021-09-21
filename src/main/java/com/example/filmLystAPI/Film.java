package com.example.filmLystAPI;

public class Film {
    private int filmId;
    private String filmTitle;
    private String filmGenre;
    private String filmRuntime;
    private String filmStreaming;
    private String filmReleaseDate;
    private String filmImage;

    public Film() {

    }

    public Film(int filmId, String filmTitle, String filmGenre, String filmRuntime, String filmStreaming, String filmReleaseDate, String filmImage) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.filmGenre = filmGenre;
        this.filmRuntime = filmRuntime;
        this.filmStreaming = filmStreaming;
        this.filmReleaseDate = filmReleaseDate;
        this.filmImage = filmImage;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public String getFilmRuntime() {
        return filmRuntime;
    }

    public String getFilmStreaming() {
        return filmStreaming;
    }

    public String getFilmReleaseDate() {
        return filmReleaseDate;
    }

    public String getFilmImage() {
        return filmImage;
    }
}
