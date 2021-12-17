package com.springsimplespasos.hibernate.entidades.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "socios")
public class Socio implements Serializable {

    @Id
    @GeneratedValue
    private Integer codigo;
    private String nombre;
    private String documento;

    public Socio() {

    }

    public Socio(Integer codigo, String nombre, String documento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.documento = documento;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
