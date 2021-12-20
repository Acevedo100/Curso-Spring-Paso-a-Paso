package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;


import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;

//Se encuentra sin nada, ya que al extender de PersonDAO, implementa esos metodos
public interface AlumnoDAO extends PersonaDAO{

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);

}
