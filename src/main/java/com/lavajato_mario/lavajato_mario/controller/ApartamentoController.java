package com.lavajato_mario.lavajato_mario.controller;

import com.lavajato_mario.lavajato_mario.model.Apartamento;
import com.lavajato_mario.lavajato_mario.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

    @RestController
    @RequestMapping ("/apartamentos")
    public class ApartamentoController {
        @Autowired
        private ApartamentoRepository apartamentoRepository;

        @GetMapping
        public List<Apartamento> todosOsApartamnentos(){
            return apartamentoRepository.findAll();
        }
}

