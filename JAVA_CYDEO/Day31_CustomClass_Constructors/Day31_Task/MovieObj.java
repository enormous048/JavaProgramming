package Day31_CustomClass_Constructors.Day31_Task;

import java.util.Arrays;

public class MovieObj {
    public static void main(String[] args) {


        Movie movie = new Movie("USA", "Road to SDET", "Adventures", "Naz Kovalchuk", 2022);
        movie.cast.addAll(Arrays.asList("Naz", "Andriy", "Andrew", "Sergey"));

        System.out.println(movie);

    }
}
