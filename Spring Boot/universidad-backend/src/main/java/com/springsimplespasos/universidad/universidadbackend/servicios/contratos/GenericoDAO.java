package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;
import java.util.Optional;

// Definimos un Dao generico, el cual lleva los metodos del crud, y los otros dao heredan de el.
public interface GenericoDAO <E>{

    Optional<E> findById(Integer id);
    E save (E entidad);
    Iterable<E> findAll();
    void deleteById (Integer id);

}
