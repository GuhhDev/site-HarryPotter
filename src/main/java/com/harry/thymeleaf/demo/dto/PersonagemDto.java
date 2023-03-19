package com.harry.thymeleaf.demo.dto;

import com.harry.thymeleaf.demo.entities.Casa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonagemDto {

    private int id;
    private String nome;
    private Casa casa;
    private Date dataNascimento;
    private String fotoUrl;
}
