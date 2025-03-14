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
    private LocalDate fechaDeNacimiento;// AA-MM-DD-fecha actual-adadde la persona
    @Column
    private String automovil;
    @Enumerated(EnumTipe.STRIG)
    private TipoAutomovil tipoAutomovil
    //Es de uno a uno

    // Constructor vacío
    public Conductor() {}

    // Constructor con parámetros
    public Conductor(String nombre, String apellido, Date fechaNacimiento, String automovil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.automovil = automovil;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    