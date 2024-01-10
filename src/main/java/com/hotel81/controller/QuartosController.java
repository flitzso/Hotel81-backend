package com.hotel81.controller;

import com.hotel81.entity.Quartos;
import com.hotel81.service.QuartosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quartos")
@CrossOrigin
public class QuartosController {

    @Autowired
    private QuartosService quartosService;

    @GetMapping("/quartos")
    public List<Quartos> buscarTodos() {
        return quartosService.buscarTodos();
    }

    @PostMapping
    public Quartos inserir(@RequestBody Quartos quartos) {
        return quartosService.inserir(quartos);
    }

    @PutMapping
    public Quartos alterar(@RequestBody Quartos quartos){
        return quartosService.alterar(quartos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        quartosService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
