package com.forohub6.forohub6.controller;


import com.forohub6.forohub6.dto.TopicoRegistrarDato;
import com.forohub6.forohub6.model.Topico;
import com.forohub6.forohub6.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/topico")
public class TopicController {
    @Autowired
    TopicoRepository topicoRepository;


    @PostMapping
    public void registrarTopico(@RequestBody @Valid TopicoRegistrarDato topicoRegistrarDato){
        topicoRepository.save(new Topico (topicoRegistrarDato));
    }
}
