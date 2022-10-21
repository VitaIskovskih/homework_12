package ru.netology;

public class PosterData {

    private int id;
    private int yearOfIssue;
    private String posterLink;
    private String movieTitle;
    private String filmGenre;

    public PosterData(int id, int yearOfIssue, String posterLink, String movieTitle, String filmGenre) {
        this.id = id;
        this.yearOfIssue = yearOfIssue;
        this.posterLink = posterLink;
        this.movieTitle = movieTitle;
        this.filmGenre = filmGenre;
    }
}
