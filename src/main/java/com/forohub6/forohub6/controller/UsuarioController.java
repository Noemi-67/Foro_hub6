package com.forohub6.forohub6.controller;

import com.forohub6.forohub6.dto.UsuarioRegistrarDato;
import com.forohub6.forohub6.model.Topico;
import com.forohub6.forohub6.model.Usuario;
import com.forohub6.forohub6.repository.TopicoRepository;
import com.forohub6.forohub6.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody @Valid UsuarioRegistrarDato usuarioRegistrarDato) {

        usuarioRepository.save(new Usuario(usuarioRegistrarDato));

    }
}
