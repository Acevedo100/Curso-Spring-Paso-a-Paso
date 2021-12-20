package com.acevedo.plataforma.plataformabackend.modelo.entidades;

import com.acevedo.plataforma.plataformabackend.modelo.entidades.enumeradores.Estado;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


//Clase que genera tabla personalizada  en BD
@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {


// Declaracion de variables que con anotaciones se hacen atributos de DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 80)
    private String nombre;
    @Column(name = "genero")
    private String genero;
    @Column(name = "servicio_Stream")
    private String servicioStream;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado_Pelicula", nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;
    @Column(name = "fecha_modiciacion")
    private LocalDateTime fechaModificacion;

// Constructores
    public Pelicula() {
    }

    public Pelicula(Integer id, String nombre, String genero, String servicioStream, String descripcion, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.servicioStream = servicioStream;
        this.descripcion = descripcion;
        this.estado = estado;
    }

// Metodos de accesos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getServicioStream() {
        return servicioStream;
    }

    public void setServicioStream(String servicioStream) {
        this.servicioStream = servicioStream;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @PrePersist
    private void antesDePersistir(){
        this.fechaAlta = LocalDateTime.now();
    }

    @PreUpdate
    private void antesDeUpdate(){
        this.fechaModificacion = LocalDateTime.now();
    }


// metodo to, para respuesta programada.
    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", servicioStream='" + servicioStream + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }


// Metodos de validacion
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return id.equals(pelicula.id) && nombre.equals(pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }


}
