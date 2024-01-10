package com.hotel81.service;

import com.hotel81.entity.Reservas;
import com.hotel81.repository.ReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservasService {

    @Autowired
    private ReservasRepository reservasRepository;

    public List<Reservas> buscarTodos() {
        return reservasRepository.findAll();
    }

    public Reservas inserir(Reservas reservas){
        reservas.setDataCriacao(LocalDateTime.now());
        Reservas reservasNew = reservasRepository.saveAndFlush(reservas);
        return reservasNew;
    }

    public Reservas alterar(Reservas reservas){
        reservas.setDataAtualizacao(LocalDateTime.now());
        return reservasRepository.saveAndFlush(reservas);
    }

    public void excluir(Long id) {
        Reservas reservas = reservasRepository.findById(id).orElse(null);
        if (reservas != null) {
            reservasRepository.delete(reservas);
        }
    }
}
