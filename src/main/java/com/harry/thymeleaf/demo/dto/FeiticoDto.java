package com.harry.thymeleaf.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FeiticoDto {
    private int id;
    private String nome;
    private String descricao;
    private String tipo;
}
