package com.harry.thymeleaf.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CasaDto {
    private int id;
    private String nome;
    private String cor;
    private String fundador;
    private String animal;
}
