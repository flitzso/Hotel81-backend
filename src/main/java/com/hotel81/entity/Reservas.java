package com.hotel81.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reservas")
@Data
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer cliente_id;
    private Integer quarto_id;
    private Integer data_entrada;
    private Integer data_saida;
    private String status;

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getQuarto_id() {
        return quarto_id;
    }

    public void setQuarto_id(Integer quarto_id) {
        this.quarto_id = quarto_id;
    }

    public Integer getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Integer data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Integer getData_saida() {
        return data_saida;
    }

    public void setData_saida(Integer data_saida) {
        this.data_saida = data_saida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
