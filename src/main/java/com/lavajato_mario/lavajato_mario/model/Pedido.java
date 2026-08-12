package com.lavajato_mario.lavajato_mario.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
public class Pedido {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer codPedido;
    private LocalDate diaLavagem;
    private String tipoLavagem;
    private String observacao;
    private String statusPedido;
    private BigDecimal valorServico;


    @ManyToOne
    @JoinColumn (name = "cod_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn (name = "cod_carro")
    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodPedido(Integer codPedido) {
        this.codPedido = codPedido;
    }

    public Integer getCodPedido() {
        return codPedido;
    }

    public void  setDiaLavagem(LocalDate diaLavagem) {
        this.diaLavagem = diaLavagem;
    }

    public LocalDate getDiaLavagem() {
        return diaLavagem;
    }

    public void setTipoLavagem(String tipoLavagem) {
        this.tipoLavagem = tipoLavagem;
    }

    public String getTipoLavagem() {
        return tipoLavagem;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setValorServico(BigDecimal valorServico) {
        this.valorServico = valorServico;
    }

    public BigDecimal getValorServico() {
        return valorServico;
    }


}
