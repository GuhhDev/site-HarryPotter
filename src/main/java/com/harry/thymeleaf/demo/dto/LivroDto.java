package com.harry.thymeleaf.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivroDto {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicao;
    private String sinopse;
}
