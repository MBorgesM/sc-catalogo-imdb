package movie;

import person.Actor;
import person.Director;
import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    private String title;
    private LocalDate releaseDate;
    private double budget;
    private String country;
    private String genre;
    private Director director;
    private ArrayList<Actor> casting;
    private ArrayList<Integer> ratings;

    public Movie(String title, LocalDate releaseDate, double budget, String country, String genre, Director director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.country = country;
        this.genre = genre;
        this.director = director;
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

    public LocalDate getReleaseDate() {
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
}
