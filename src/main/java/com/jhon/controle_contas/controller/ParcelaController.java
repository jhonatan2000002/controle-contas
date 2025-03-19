package com.jhon.controle_contas.controller;

import com.jhon.controle_contas.model.Parcela;
import com.jhon.controle_contas.repository.ParcelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parcelas")
public class ParcelaController {

    @Autowired
    private ParcelaRepository parcelaRepository;

    @GetMapping
    public List<Parcela> listarParcelas() {
        return parcelaRepository.findAll();
    }

    @PostMapping
    public Parcela criarParcela(@RequestBody Parcela parcela) {
        return parcelaRepository.save(parcela);
    }
}
