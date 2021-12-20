package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.repositorios.CarreraRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


// Implementamos los metoddos  para darle funcionalidad de la interfaz CarreraDAO
// Extiende de GenericoDAOimpl enviando como parametro la clase que se quiere ocupar + y el repositorio que creamos para esa clase.

@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera,CarreraRepository> implements CarreraDAO {

    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true) // Especifica que este metodo es solo de busqueda.
    public Iterable<Carrera> findCarreraByNombreContains(String nombre) {
        return repository.findCarreraByNombreContains(nombre) ;
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre) {
        return repository.findCarreraByNombreContainsIgnoreCase(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios) {
        return repository.findCarreraByCantidadAniosAfter(cantidadAnios);
    }
}
