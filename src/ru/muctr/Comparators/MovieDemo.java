package ru.muctr.Comparators;

import java.util.Arrays;
import java.util.Comparator;

public class MovieDemo {
    public static void main(String[] args) {
        new MovieDemo().go();
    }

    private void go() {
        Movie movie1 = new Movie("Matrix", 1999, "Reeves");
        Movie movie2 = new Movie("Mission Impossible", 1996, "Cruise");
        Movie movie3 = new Movie("Divergent", 2014, "Woodley");

        //********* Сортировка массива строк *****************************************

        String[] movieTitles = new String[]{movie1.getTitle(),
            movie2.getTitle(), movie3.getTitle()};
        Arrays.sort(movieTitles);
        System.out.println(Arrays.toString(movieTitles));
        //********* Сортировка массива объектов пользовательского класса ************

        Movie[] movies = new Movie[]{movie1, movie2, movie3};
        Arrays.sort(movies);
        System.out.println(Arrays.toString(movies));

        //********* Компараторы *****************************************************

        Comparator<Movie> byYear = Comparator.comparingInt(Movie::getYear)
                .thenComparing(Movie::getTitle);
        Arrays.sort(movies, byYear);
        System.out.println(Arrays.toString(movies));
        //********** Record *********************************************************

        MovieRecord movie11 = new MovieRecord("Matrix", 1999, "Reeves","Keanu" );
        MovieRecord movie22 = new MovieRecord("Matrix", 1999, "Reeves","Keanu" );
//        MovieRecord movie44 = new MovieRecord("Divergent", 2014, "Woodley");

        System.out.println(movie11.equals(movie22));
        System.out.println(movie11);
    }
}
