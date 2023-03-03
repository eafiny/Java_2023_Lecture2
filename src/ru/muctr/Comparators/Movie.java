package ru.muctr.Comparators;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private String starring;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public Movie(String title, int year, String starring) {
        this.title = title;
        this.year = year;
        this.starring = starring;
    }

    @Override
    public String toString() {
        return String.format("Movie %s, year %d, starring %s", title, year, starring);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(title, movie.title) && Objects.equals(starring, movie.starring);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, starring);
    }

    @Override
    public int compareTo(Movie o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
