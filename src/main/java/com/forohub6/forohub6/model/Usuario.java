package com.forohub6.forohub6.model;

import com.forohub6.forohub6.dto.UsuarioRegistrarDato;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private String nombre;
    private String email;
    private String password;


    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public Usuario() {
    }

    public Usuario(UsuarioRegistrarDato usuarioRegistrarDato) {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password1) {
        this.password=password;
    }}

