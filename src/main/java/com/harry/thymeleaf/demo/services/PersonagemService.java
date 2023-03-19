package com.harry.thymeleaf.demo.services;

import com.harry.thymeleaf.demo.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {

    @Autowired
    private CasaRepository casaRepository;
}
