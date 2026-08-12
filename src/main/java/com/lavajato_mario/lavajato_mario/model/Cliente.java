package com.lavajato_mario.lavajato_mario.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer codCliente;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    @OneToOne
    @JoinColumn (name = "cod_apartamento")
    private Apartamento apartamento;

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public  void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

}
