package com.example.demo.controller;

import com.example.demo.domain.Motorista;
import com.example.demo.service.MotoristaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MotoristaControllerTest {

    private MotoristaService service;
    private MotoristaController controller;

    @BeforeEach
    void setUp() {
        service = mock(MotoristaService.class);
        controller = new MotoristaController(service);
    }

    @Test
    void BuscaMotoristaOkTest(){
        // Arrange
        long id = 1L;
        Motorista motorista = new Motorista();
        Mockito.when(service.BuscaMotoristaPorId(id)).thenReturn(motorista);

        // Act
        Motorista motoristaEncontrado = controller.BuscaMotoristaPorId(id);

        // Assert
        Mockito.verify(service).BuscaMotoristaPorId(id);
        assertEquals(motorista, motoristaEncontrado);
    }

}
