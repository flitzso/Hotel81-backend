package com.hotel81.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "quartos")
@Data
public class Quartos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer numeroQuarto;
    private String tipo;
    private String descricao;
    private Integer precoDiaria;

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Integer precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
}
