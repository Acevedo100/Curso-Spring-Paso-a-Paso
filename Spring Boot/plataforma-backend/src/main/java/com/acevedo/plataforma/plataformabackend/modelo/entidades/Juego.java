package com.acevedo.plataforma.plataformabackend.modelo.entidades;

import com.acevedo.plataforma.plataformabackend.modelo.entidades.enumeradores.Estado;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


//Clase que genera tabla personalizada  en BD
@Entity
@Table(name = "Juegos")
public class Juego implements Serializable {

// Declaracion de variables que con anotaciones se hacen atributos de DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 80)
    private String nombre;
    @Column(name = "consola",nullable = false )
    private String consola;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado_Juego",nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;
    @Column(name = "fecha_modiciacion")
    private LocalDateTime fechaModificacion;


// Constructores
    public Juego() {
    }

    public Juego(Integer id, String nombre, String consola, String descripcion, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.consola = consola;
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

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
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
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", consola='" + consola + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }


// Metodos de validaciones.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return id.equals(juego.id) && nombre.equals(juego.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
