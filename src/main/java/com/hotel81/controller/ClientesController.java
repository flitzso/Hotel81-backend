package com.hotel81.controller;


import com.hotel81.entity.Clientes;
import com.hotel81.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping("/clientes")
    public List<Clientes> buscarTodos() {
        return clientesService.buscarTodos();
    }

    @PostMapping
    public Clientes inserir(@RequestBody Clientes clientes) {
        return clientesService.inserir(clientes);
    }

    @PutMapping
    public Clientes alterar(@RequestBody Clientes clientes){
        return clientesService.alterar(clientes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        clientesService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
