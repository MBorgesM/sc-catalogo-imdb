package Catalog;

import Interface.ICatalog;
import java.util.List;

public class PeopleCatalog implements ICatalog {

    List<Person> people;

    @Override
    public void addItem(Object item) {
        this.people.add(item);
    }

    @Override
    public void search(String name) {
        for (Person person : this.people){
            if(person.name == name){
                return person;
            }
        }
    }

    @Override
    public boolean remove(Object item) {
        this.people.remove(item);
        return true;
    }

    @Override
    public List list() {
        for (Person person : this.people){
            System.out.println(person);
        }
        return null;
    }

    @Override
    public String toString() {
        return "PeopleCatalog{" +
                "people=" + people +
                '}';
    }
}
