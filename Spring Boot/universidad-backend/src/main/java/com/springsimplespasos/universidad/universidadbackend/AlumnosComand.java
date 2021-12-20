package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

//Clase para implementar las query pero no por metodos, sino por las anotaciones

@Component
public class AlumnosComand implements CommandLineRunner {

    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;
    @Autowired
    private CarreraDAO carreraDAO;

    @Override
    public void run(String... args) throws Exception {

        //select
        Optional<Carrera> ingSistemas = carreraDAO.findById(2);

         Iterable<Persona> alumnos   = personaDAO.findAll();
       // alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
         alumnos.forEach(alumno -> personaDAO.save(alumno));

         Optional<Persona> alumno_1 =  personaDAO.findById(1);

        Optional<Persona> personaNomApe =  personaDAO.buscarPorNombreYApellido(alumno_1.get().getNombre(),alumno_1.get().getApellido());
        System.out.println(personaNomApe.toString());

        Optional<Persona> personaDni =  personaDAO.buscarPorDni(alumno_1.get().getDni());
        System.out.println(personaDni.toString());

        Iterable<Persona> personasApellido =  personaDAO.buscarPersonaPorApellido(alumno_1.get().getApellido());
        personasApellido.forEach(System.out::println);
    }
}
