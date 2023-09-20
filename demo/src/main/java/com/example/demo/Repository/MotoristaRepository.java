package com.example.demo.Repository;

import com.example.demo.domain.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//TODO: Corrigir a identação desse código
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {

}
