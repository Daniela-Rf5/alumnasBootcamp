package org.factoriaf5.alumnas.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "alumnas")
public class Alumna implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String pais_origen;
    private String nivel_de_estudios;
    private String direccion;
    private Integer promocionF5;

    public Long getId() {return id;}
    public void setId(Long id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPais_origen() {
        return pais_origen;
    }
    public void setPais_origen(String paisOrigen) {
        this.pais_origen = pais_origen;
    }

    public String getNivel_de_estudios() {
        return nivel_de_estudios;
    }
    public void setNivel_de_estudios(String nivel_de_estudios) {
        this.nivel_de_estudios = nivel_de_estudios;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getPromocionF5() {
        return promocionF5;
    }
    public void setPromocionF5(Integer promocionF5) {
        this.promocionF5 = promocionF5;
    }
    @Override
    public String toString() {
        return "Alumna{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                ", pais de origen='" + pais_origen + '\'' +
                ", nivel de estudios='" + nivel_de_estudios + '\'' +
                ", direccion='" + direccion + '\'' +
                ", promocion de f5='" + promocionF5 + '\'' +
                '}';
    }}