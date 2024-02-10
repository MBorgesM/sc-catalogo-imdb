package Catalog;

import Interface.ICatalog;

import javax.xml.catalog.Catalog;
import java.util.List;
import java.util.stream.Stream;

public class PeopleCatalog implements ICatalog {

    List<Person> people;

    @Override
    public void addItem(Object item) {

    }

    @Override
    public void search(String title) {

    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public List list() {
        return null;
    }
}
