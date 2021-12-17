package com.springsimplespasos.universidad.universidadbackend.modelo.entidades;


import java.io.Serializable;
import java.time.LocalDateTime;

public class Pabellon implements Serializable {

    private Integer id;
    private Double mts2;
    private String nombre;
    private LocalDateTime fechaAlta;
    private LocalDateTime fechaUltimaModificacion;


}
