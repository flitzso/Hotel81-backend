package com.hotel81.service;

import com.hotel81.entity.Clientes;
import com.hotel81.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> buscarTodos() {
        return clientesRepository.findAll();
    }

    public Clientes inserir(Clientes clientes){
        clientes.setDataCriacao(LocalDateTime.now());
        Clientes userNew = clientesRepository.saveAndFlush(clientes);
        return userNew;
    }

    public Clientes alterar(Clientes clientes){
        clientes.setDataAtualizacao(LocalDateTime.now());
        return clientesRepository.saveAndFlush(clientes);
    }

    public void excluir(Long id) {
        Clientes clientes = clientesRepository.findById(id).orElse(null);
        if (clientes != null) {
            clientesRepository.delete(clientes);
        }
    }
}
