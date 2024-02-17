package Catalog;

import Interface.ICatalog;
import movie.Movie;
import person.Actor;
import person.Director;

import java.util.List;
import java.util.Objects;

public class MovieCatalog implements ICatalog {

    List<Movie> movies;

    public MovieCatalog(List<Movie> movies) {
        this.movies = movies;
    }


    private boolean associateActor(Movie movie, Actor actor){
        movie.addActorToCast(actor);
        return true;
    }

    private boolean associateDirector(Movie movie, Director director){
        movie.associateDirector(director);
        return false;
    }

    @Override
    public boolean addItem(Object item) {
        this.movies.add((Movie) item);
        return true;
    }

    @Override
    public Object search(String title) {
        for (Movie movie : this.movies){
            if(Objects.equals(movie.getTitle(), title)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object item) {
        this.movies.remove(item);
        return true;
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public String toString() {
        return "FilmCatalog{" +
                "films=" + movies +
                '}';
    }
}
