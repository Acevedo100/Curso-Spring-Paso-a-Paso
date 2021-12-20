package com.acevedo.plataforma.plataformabackend.modelo.entidades;


import com.acevedo.plataforma.plataformabackend.modelo.entidades.enumeradores.Estado;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table( name = "Series")
public class Serie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 80)
    private String nombre;
    @Column(name = "temporada",nullable = false )
    private String temporada;
    @Column(name = "genero")
    private String genero;
    @Column(name = "servicio_stream")
    private String servicioStream;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado_Juego",nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;
    @Column(name = "fecha_modiciacion")
    private LocalDateTime fechaModificacion;

    public Serie() {
    }

    public Serie(Integer id, String nombre, String temporada, String genero, String servicioStream, String descripcion, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.temporada = temporada;
        this.genero = genero;
        this.servicioStream = servicioStream;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", genero='" + genero + '\'' +
                ", servicioStream='" + servicioStream + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return id.equals(serie.id) && nombre.equals(serie.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}

