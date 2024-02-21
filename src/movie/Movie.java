package movie;

import person.Actor;
import person.Director;

import java.util.ArrayList;
import java.util.Date;

public class Movie {
    private String title;
    private Date releaseDate;
    private double budget;
    private String country;
    private String genre;
    private Director director;
    private ArrayList<Actor> casting;
    private ArrayList<Integer> ratings;

    public Movie(String title, Date releaseDate, double budget, String country, String genre) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.country = country;
        this.genre = genre;
        this.casting = new ArrayList<Actor>();
        this.ratings = new ArrayList<>();
    }

    public void associateDirector(Director director) {
        this.director = director;
    }

    public void addActorToCast(Actor actor) {
        this.casting.add(actor);
    }

    public void rate(int rating) {
        this.ratings.add(rating);
    }

    public double getRating() {
        return this.ratings.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    public String getCountry() {
        return country;
    }

    public String getGenre() {
        return genre;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getCasting() {
        return casting;
    }

    @Override
    public String toString() {
        return "Title: " + title + '\n' +
                "Release Date: " + releaseDate + '\n' +
                "Budget: " + budget + '\n' +
                "Country: " + country + '\n' +
                "Genre: " + genre + '\n' +
                "Director: " + director + '\n' +
                "Casting: " + casting + '\n' +
                "Ratings: " + getRating() + '\n';
    }
}
