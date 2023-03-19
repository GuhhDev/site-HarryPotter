package com.harry.thymeleaf.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicao;
    private String sinopse;

}




