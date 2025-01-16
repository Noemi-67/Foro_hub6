package com.forohub6.forohub6.model;

import com.forohub6.forohub6.dto.TopicoRegistrarDato;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity(name = "Topico")
@Table(name = "topico")
@EqualsAndHashCode(of = "topicId")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private Long topicId;

    private String titulo;
    private String mensaje;
    private boolean status;

    private String curso;

    @Column(name = "feDeCreacion")
    private LocalDateTime feDeCreacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario; // Assuming there's a 'Usuario' entity

    public Topico(String titulo, String mensaje, String curso, Usuario usuario) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.status = true;
        this.curso = curso;
        this.usuario = usuario;
        this.feDeCreacion = LocalDateTime.now();
    }

    public Topico() {}

    public Topico(TopicoRegistrarDato topicoRegistrarDato) {
        // Initialize from DTO if necessary
    }

    // Getters and Setters
    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDateTime getFeDeCreacion() {
        return feDeCreacion;
    }

    public void setFeDeCreacion(LocalDateTime feDeCreacion) {
        this.feDeCreacion = feDeCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
