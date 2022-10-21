package ru.netology;

public class PosterManager {
    private PosterData[] movies = new PosterData[0];
    protected int maxNumberOfFilms;
    public PosterManager() {
        this.maxNumberOfFilms = 10;
    }
    public PosterManager(int maxNumberOfFilms) {
        this.maxNumberOfFilms = maxNumberOfFilms;
    }
    //Добавление нового фильма
    public void add(PosterData movie) {
        PosterData[] tmp = new PosterData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

//Вывод всех фильмов в порядке добавления
    public PosterData[] findAll() {
         return movies;
}
//Вывод последних добавленных фильмов
    public PosterData[] findLast() {
        int lastItemIndex;
        if (movies.length < maxNumberOfFilms) {
            lastItemIndex = movies.length;
        } else {
            lastItemIndex = maxNumberOfFilms;
        }
        PosterData[] tmp = new PosterData[lastItemIndex];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
