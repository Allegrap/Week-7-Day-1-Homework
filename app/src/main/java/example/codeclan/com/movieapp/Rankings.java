package example.codeclan.com.movieapp;

import java.lang.reflect.Array;

/**
 * Created by user on 17/04/2017.
 */

public class Rankings {

    private String[] movies;

    public Rankings() {
        this.movies = new String[10];
        setUpMovies();
    }

    private void getMovies(){
        String[] movies = {
                "Moonlight",
                "Lord of the Rings",
                "Sing Street",
                "Pride",
                "Moana",
                "Scary Movie 3",
                "Moulin Rouge",
                "40 Year Old Virgin",
                "Your Highness",
                "The Get Down"};
    }
}
