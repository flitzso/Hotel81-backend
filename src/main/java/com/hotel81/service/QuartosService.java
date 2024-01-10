package com.hotel81.service;

import com.hotel81.entity.Quartos;
import com.hotel81.repository.QuartosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class QuartosService {

    @Autowired
    private QuartosRepository quartosRepository;

    public List<Quartos> buscarTodos() {
        return quartosRepository.findAll();
    }

    public Quartos inserir(Quartos quartos){
        quartos.setDataCriacao(LocalDateTime.now());
        Quartos quartosNew = quartosRepository.saveAndFlush(quartos);
        return quartosNew;
    }

    public Quartos alterar(Quartos quartos){
        quartos.setDataAtualizacao(LocalDateTime.now());
        return quartosRepository.saveAndFlush(quartos);
    }

    public void excluir(Long id) {
        Quartos quartos = quartosRepository.findById(id).orElse(null);
        if (quartos != null) {
            quartosRepository.delete(quartos);
        }
    }
}
