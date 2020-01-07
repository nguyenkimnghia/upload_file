package repository;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();
    E findById (Long id);
    E findByName(String name);
    void save(E e);
}
