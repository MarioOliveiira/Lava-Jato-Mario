package com.lavajato_mario.lavajato_mario.controller;
import com.lavajato_mario.lavajato_mario.model.Cliente;
import com.lavajato_mario.lavajato_mario.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> todosOsCleres() {
        return clienteRepository.findAll();
    }
}
