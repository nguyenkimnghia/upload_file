package service;

import java.util.List;

public interface GeneralService<E> {
    List<E> findAllHaveBusiness();
    E findById(Long id);
    E findByName(String name);
    void saveService(E e);
}
