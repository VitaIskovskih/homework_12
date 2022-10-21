package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TestPosterManager {
    PosterData movies1 = new PosterData(11, 2022, "1920x.webp", "Сердце памы", "Драмма");
    PosterData movies2 = new PosterData(12, 2022, "1921x.webp", "Плакать нельзя", "Триллер");
    PosterData movies3 = new PosterData(13, 2022, "1922x.webp", "Средневековье", "Биография");
    PosterData movies4 = new PosterData(14, 2022, "1923x.webp", "Мой тигр", "Приключение");
    PosterData movies5 = new PosterData(15, 2022, "1924x.webp", "Вершина страха", "Драмма");
    PosterData movies6 = new PosterData(16, 2022, "1925x.webp", "Три тысячи лет желаний", "Ужасы");
    PosterData movies7 = new PosterData(17, 2022, "1926x.webp", "Маленький Николя", "Мультфильм");
    PosterData movies8 = new PosterData(18, 2022, "1927x.webp", "Красная шапочка", "Фэнтези");
    PosterData movies9 = new PosterData(19, 2022, "1928x.webp", "Море страха", "Триллер");
    PosterData movies10 = new PosterData(20, 2022, "1929x.webp", "Девушка в окне", "Ужасы");

    @Test
    public void test1() {
        PosterManager repo = new PosterManager(5);
        repo.add(movies1);
        repo.add(movies2);
        repo.add(movies3);
        repo.add(movies4);
        repo.add(movies5);

        PosterData[] expected = {movies1, movies2, movies3, movies4, movies5};
        PosterData[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        PosterManager repo = new PosterManager();
        repo.add(movies1);
        repo.add(movies2);
        repo.add(movies3);
        repo.add(movies4);
        repo.add(movies5);
        repo.add(movies6);
        repo.add(movies7);
        repo.add(movies8);
        repo.add(movies9);
        repo.add(movies10);

        PosterData[] expected = {movies1, movies2, movies3, movies4, movies5, movies6, movies7, movies8, movies9, movies10};
        PosterData[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        PosterManager repo = new PosterManager();
        repo.add(movies1);
        repo.add(movies2);
        repo.add(movies3);
        repo.add(movies4);
        repo.add(movies5);

        PosterData[] expected = {movies5, movies4, movies3, movies2, movies1};
        PosterData[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        PosterManager repo = new PosterManager();
        repo.add(movies1);
        repo.add(movies2);
        repo.add(movies3);
        repo.add(movies4);
        repo.add(movies5);
        repo.add(movies6);
        repo.add(movies7);
        repo.add(movies8);
        repo.add(movies9);
        repo.add(movies10);

        PosterData[] expected = {movies10, movies9, movies8, movies7, movies6, movies5, movies4, movies3, movies2, movies1};
        PosterData[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
