package Catalog;

import Interface.ICatalog;
import person.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleCatalog implements ICatalog {
    List<Person> people;

    public PeopleCatalog() {
        this.people = new ArrayList<>();
    }

    @Override
    public boolean addItem(Object item) {
        this.people.add((Person) item);
        return false;
    }

    @Override
    public Object search(String name) {
        for (Person person : this.people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object item) {
        this.people.remove(item);
        return true;
    }

    @Override
    public List<Person> list() {
        for (Person person : this.people) {
        }
        return people;
    }

    @Override
    public String toString() {
        return "PeopleCatalog{" +
                "people=" + people +
                '}';
    }
}
