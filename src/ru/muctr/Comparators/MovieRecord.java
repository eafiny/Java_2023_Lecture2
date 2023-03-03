package ru.muctr.Comparators;

/**
 * @author Evgenia Skichko
 */
public record MovieRecord(String title, int year, String starring) {
    public MovieRecord {
        if(year < 1900) throw new IllegalArgumentException("Год должен быть больше 1900");
        title = title.toUpperCase();
    }

    public MovieRecord (String title, int year, String name, String surname){
        this(title, year, name + " " + surname);
    }
}
