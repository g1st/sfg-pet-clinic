package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by gs on 04/05/2021.
 **/
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
