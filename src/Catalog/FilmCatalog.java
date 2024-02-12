package Catalog;

import Interface.ICatalog;
import java.util.List;

public class FilmCatalog implements ICatalog {

    List<Film> films;


    private boolean associateActor(Film film, String name){
        film.associateActor(name);
        return true;
    }

    private boolean associateDirector(Film film, String name){
        film.associateDirector(name);
        return false;
    }

    @Override
    public boolean addItem(Object item) {
        this.films.add(film);
        return true;
    }

    @Override
    public Object search(String title) {
        for (Film film : this.films){
            if(film.title == title){
                return film;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object item) {
        this.films.remove(item);
        return true;
    }

    @Override
    public List list() {
        for (Film film : films){
            System.out.println(film);
        }
        return null;
    }

    @Override
    public String toString() {
        return "FilmCatalog{" +
                "films=" + films +
                '}';
    }
}
