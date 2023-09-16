package ph.edu.sorsu.dao;

import java.util.List;

public interface BaseDAO<T> {
    public void create(T entity);

    public T read(int indexPosition);

    public void update(int indexPosition, T entity);

    public void delete(int indexPosition);

    public List<T> readAll();
}
