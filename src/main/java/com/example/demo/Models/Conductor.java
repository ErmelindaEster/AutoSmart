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
    private Integer edad;
    @Column
    private String automovil;
    @Enumerated(EnumType.STRING)
    private TipoAutomovil tipoAutomovil;
    //Es de uno a uno
    @OneToOne(mappedBy = "conductor", cascade = CascadeType.ALL)
    private Viaje viaje; 
    private boolean estado = true;// Agregado por defecto en true

    // Constructor vacío
    public Conductor() {}

    // Constructor con parámetros
    public Conductor(String nombre, String apellido,int edad, String automovil, TipoAutomovil tipoAutomovil, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.automovil = automovil; 
        this.tipoAutomovil = tipoAutomovil; 
        this.estado = estado;// siempre inicia activo
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad= edad;
    }

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
 
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean apellido) {
        this.estado = estado;
    }


    