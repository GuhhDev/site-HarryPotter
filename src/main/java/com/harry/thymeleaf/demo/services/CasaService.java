package com.harry.thymeleaf.demo.services;

import com.harry.thymeleaf.demo.dto.CasaDto;
import com.harry.thymeleaf.demo.entities.Casa;
import com.harry.thymeleaf.demo.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasaService {

    @Autowired
    private CasaRepository casaRepository;

    public List<CasaDto> findAll() {
        List<Casa> casas = casaRepository.findAll();
        return casas.stream().map(this::convertToCasaDTO).collect(Collectors.toList());
    }

    private CasaDto convertToCasaDTO(Casa casa) {
        CasaDto casaDTO = new CasaDto();
        casaDTO.setId(casa.getId());
        casaDTO.setNome(casa.getNome());
        casaDTO.setCor(casa.getCor());
        casaDTO.setFundador(casa.getFundador());
        casaDTO.setAnimal(casa.getAnimal());
        return casaDTO;
    }
}