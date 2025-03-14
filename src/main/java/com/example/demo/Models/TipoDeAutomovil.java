package com.example.demo.Models;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Conductor {  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private LocalDate fechaNacimiento;// AA-MM-DD-fecha actual-adadde la persona
    @Column
    private String automovil;
    @Enumerated(EnumType.STRING)
    Private TipoAutomovil tipoAutomovil; 
    // de uno a uno
    












import jakarta.persistence.*;

@Entity
public class TipoDeAutomovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Este atributo puede contener valores como "Fiat", "Voyage", "Peugeot", etc.
    @Column(nullable = false)
    private String nombre;

    @Column
    private String descripcion;

    // Constructor vacío
    public TipoDeAutomovil() {
    }

    // Constructor con parámetros
    public TipoDeAutomovil(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método toString para facilitar la depuración
    @Override
    public String toString() {
        return "TipoDeAutomovil{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
