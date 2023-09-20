package com.example.demo.service;

import com.example.demo.Repository.MotoristaRepository;
import com.example.demo.domain.Motorista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoristaService {

    @Autowired
    MotoristaRepository repository;

    public void adicionaMotorista(Motorista motorista) {
        repository.save(motorista);
    }

    public Motorista BuscaMotoristaPorId(long id) {
        return repository.findById(id).orElse(null);
    }
}
