package com.lavajato_mario.lavajato_mario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apartamento {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Integer codApartamento;
    private Integer numeroApartamento;
    private String torreApartamento;

    public void setCodApartamento(Integer codApartamento) {
        this.codApartamento = codApartamento;
    }

    public Integer getCodApartamento() {
        return this.codApartamento;
    }

    public void setNumeroApartamento(Integer numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public Integer getNumeroApartamento() {
        return this.numeroApartamento;
    }

    public void setTorreApartamento(String torreApartamento) {
        this.torreApartamento = torreApartamento;
    }

    public String getTorreApartamento() {
        return this.torreApartamento;
    }

}
