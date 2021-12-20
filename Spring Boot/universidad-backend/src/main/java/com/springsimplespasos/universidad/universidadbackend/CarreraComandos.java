package com.springsimplespasos.universidad.universidadbackend;


import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


// Esta clase que implenta la interfaz CommanLineRunner, nos permite generar los metodos del crud.
@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {

        /*
        //Objetos a guardar en la BD
       Carrera ingSistemas = new Carrera(null,"Ingeniero en Sistemas",60,5);
       Carrera ingIndustrial = new Carrera(null,"Ingeniero Industrial",55,5);
       Carrera ingAlimentos = new Carrera(null,"Ingeniero en Alimentos",53,5);
       Carrera ingElectronico = new Carrera(null,"Ingeniero Electronico",45,5);

       // Metodo para que una vez creado el objeto, persista.
       servicio.save(ingSistemas);
       servicio.save(ingIndustrial);
       servicio.save(ingAlimentos);
       servicio.save(ingElectronico);
         */

        // find o select
        List<Carrera> carreras = (List<Carrera>) servicio.findCarreraByNombreContains("sistemas");
        carreras.forEach(System.out::println);

        List<Carrera> carrerasIgnoreCase1 = (List<Carrera>) servicio.findCarreraByNombreContainsIgnoreCase("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>) servicio.findCarreraByNombreContainsIgnoreCase("sistemas");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);
    }
}
