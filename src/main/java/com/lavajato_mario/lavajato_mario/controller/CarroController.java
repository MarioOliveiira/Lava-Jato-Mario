package com.lavajato_mario.lavajato_mario.controller;


import com.lavajato_mario.lavajato_mario.model.Carro;
import com.lavajato_mario.lavajato_mario.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/carros")
public class CarroController {
    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public List<Carro> todosOsCarros() {
        return carroRepository.findAll();
    }
}
