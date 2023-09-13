package com.example.demo.domain;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO:
    // Mudar para 'nome' porque ao chamar o objeto ficaria motorista.nomeMotorista
    // mudar o campo para um tipo que faça sentido, por exemplo se ele tem um nome como 'André Sousa'
    // o tipo do campo ideal seria String
    private long nomeMotorista;

    private long veiculo;

    private long cnh;
}
