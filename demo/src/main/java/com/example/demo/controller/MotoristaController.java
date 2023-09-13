package com.example.demo.controller;

import com.example.demo.domain.Motorista;
import com.example.demo.service.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MotoristaController {

    private MotoristaService service;

    @Autowired //TODO: essa anotação "@Autowired" pode ser movida direto para o atributo da service
    public MotoristaController(MotoristaService service) {
        this.service = service;
    }

    @PostMapping()
    public void adicionaMotorista(@RequestBody Motorista request) {

        service.adicionaMotorista(request);
    }

    @GetMapping()
    public Motorista BuscaMotoristaPorId(@RequestParam long id) {
        return service.BuscaMotoristaPorId(id);
    }
}
