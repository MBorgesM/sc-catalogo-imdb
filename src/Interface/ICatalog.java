package Interface;

import java.util.List;

public interface ICatalog<T> {
    public boolean addItem(T item);
    public T search(String title);
    public boolean remove(T item);
    public List<T> list();
}
