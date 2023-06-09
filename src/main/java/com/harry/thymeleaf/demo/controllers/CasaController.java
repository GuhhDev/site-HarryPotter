package com.harry.thymeleaf.demo.controllers;

import com.harry.thymeleaf.demo.dto.CasaDto;
import com.harry.thymeleaf.demo.entities.Casa;
import com.harry.thymeleaf.demo.services.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CasaController {

    @Autowired
    private CasaService casaService;

    @GetMapping("/casas.html")
    public String getCasas(Model model) {
        List<CasaDto> casas = casaService.findAll();
        model.addAttribute("casas", casas);
        return "casas";
    }

    @GetMapping("/bem-vindo.html")
    public String getCadastro() {
        return "bem-vindo";
    }
}