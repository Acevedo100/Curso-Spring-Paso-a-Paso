package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.repositorios.AlumnoRepository;
import com.springsimplespasos.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;



// Implementamos los metoddos  para darle funcionalidad de la interfaz AlumnoDAO
// Extiende de PersonaDAOImpl ya que esta clase implemento los metodos de creados en  PersonaRepository
// Implementa el metodo creado en la  interfaz AlumnoRepository

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {


    @Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")AlumnoRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombre)  ; // Se tiene que castear
    }
}
