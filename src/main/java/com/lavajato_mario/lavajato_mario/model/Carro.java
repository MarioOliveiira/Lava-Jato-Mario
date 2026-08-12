package com.lavajato_mario.lavajato_mario.model;

import jakarta.persistence.*;

@Entity
public class Carro {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Integer codCarro;
    private String modelo;
    private String marca;
    private String cor;

    @ManyToOne
    @JoinColumn (name = "cod_cliente")
    private Cliente cliente;

    public void setCodCarro(Integer codCarro) {
        this.codCarro = codCarro;
    }

    public Integer getCodCarro() {
        return codCarro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }


}
