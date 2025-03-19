package com.jhon.controle_contas.controller;

import com.jhon.controle_contas.model.Conta;
import com.jhon.controle_contas.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaRepository contaRepository;

    @GetMapping
    public List<Conta> listarContas() {
        return contaRepository.findAll();
    }

    @PostMapping
    public Conta criarConta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }
}
