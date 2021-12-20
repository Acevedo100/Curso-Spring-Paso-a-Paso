package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;

import java.util.Optional;

//Se encuentra sin nada, ya que al extender de GenericoDAO< Clase que se quiere tocar>, implementa esos metodos
// Se copian los metodos que se crearon en la interfaz PersonaRepository para implementar sql personalizadas.
public interface PersonaDAO extends GenericoDAO<Persona>{

    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
    Optional<Persona> buscarPorDni(String dni);
    Iterable<Persona> buscarPersonaPorApellido(String apellido);

}
