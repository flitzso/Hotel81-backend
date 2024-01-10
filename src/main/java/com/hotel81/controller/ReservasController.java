package com.hotel81.controller;

import com.hotel81.entity.Reservas;
import com.hotel81.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class ReservasController {

    @Autowired
    private ReservasService reservasService;

    @GetMapping("/reservas")
    public List<Reservas> buscarTodos() {
        return reservasService.buscarTodos();
    }

    @PostMapping
    public Reservas inserir(@RequestBody Reservas reservas) {
        return reservasService.inserir(reservas);
    }

    @PutMapping
    public Reservas alterar(@RequestBody Reservas reservas){
        return reservasService.alterar(reservas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        reservasService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
