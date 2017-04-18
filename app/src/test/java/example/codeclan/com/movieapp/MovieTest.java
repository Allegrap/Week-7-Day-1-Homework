package example.codeclan.com.movieapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("Moonlight", "Drama", 2);
    }

    @Test
    public void testMovieSetup(){
        assertEquals("Moonlight", movie.getTitle());
        assertEquals("Drama", movie.getGenre());
        assertEquals(2, movie.getCurrentRanking());
    }

    @Test
    public void setTitleTest(){
        movie.setTitle("The Truman Show");
        assertEquals("The Truman Show", movie.getTitle());
    }

    @Test
    public void setGenreTest(){
        movie.setGenre("Fantasy");
        assertEquals("Fantasy", movie.getGenre());
    }

    @Test
    public void setCurrentRankingTest(){
        movie.setCurrentRanking(1);
        assertEquals(1, movie.getCurrentRanking());
    }

    @Test
    public void canReturnAllDetailsTest(){
        assertEquals("Title: 'Moonlight', Genre: 'Drama', Ranking: 2.", movie.showAllDetails());
    }
}
