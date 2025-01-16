package com.forohub6.forohub6.dto;

import jakarta.validation.constraints.NotBlank;

public record TopicoRegistrarDato(

@NotBlank
        String titulo,
@NotBlank
        String mensaje,
@NotBlank
        String curso)

{
}
