package example.codeclan.com.movieapp;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {


    private String title;
    private String genre;
    private int current_ranking;

    public Movie(String title, String genre, int current_ranking) {
        this.title = title;
        this.genre = genre;
        this.current_ranking = current_ranking;
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getCurrentRanking() {
        return current_ranking;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCurrentRanking(int currentRanking) {
        this.current_ranking = currentRanking;
    }

    public String showAllDetails() {
        return "Title: '" + title + "', Genre: '" + genre + "', Ranking: " + current_ranking + ".";
    }
}
