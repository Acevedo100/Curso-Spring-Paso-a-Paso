package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;

//Se encuentra sin nada, ya que al extender de GenericoDAO< Clase que se quiere tocar>, implementa esos metodos
public interface CarreraDAO extends GenericoDAO<Carrera>{


    Iterable<Carrera> findCarreraByNombreContains(String nombre);
    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);
    Iterable<Carrera> findCarreraByCantidadAniosAfter(Integer cantidadAnios);

}
