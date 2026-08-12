package com.lavajato_mario.lavajato_mario.controller;

import com.lavajato_mario.lavajato_mario.model.Pedido;
import com.lavajato_mario.lavajato_mario.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido> todosOsPedidos() {
        return pedidoRepository.findAll();
    }
}
