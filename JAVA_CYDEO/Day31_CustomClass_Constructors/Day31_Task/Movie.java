package Day31_CustomClass_Constructors.Day31_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, director;
    public int releaseDate;

    ArrayList<String> cast = new ArrayList<>();


    public Movie(String country, String title, String genre, String director, int releaseDate) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String name){
        cast.add(name);
    }
    public void addCasts(String[] names){
        cast.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Country= " + country +"\n"+
                "title= " + title  +"\n"+
                "genre= " + genre  +"\n"+
                "director= " + director +"\n"+
                "releaseDate= " + releaseDate +"\n"+
                "cast number= " + cast.size();
    }
}
