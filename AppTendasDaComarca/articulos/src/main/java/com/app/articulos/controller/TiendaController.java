package com.app.articulos.controller;

import com.app.articulos.entities.Tienda;
import com.app.articulos.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tiendas")
public class TiendaController {
    @Autowired
    private TiendaService tiendaService;

    @GetMapping
    public List<Tienda> findAll() {
        return tiendaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tienda> findById(@PathVariable Long id) {
        return tiendaService.findById(id);
    }

    @PostMapping
    public Tienda save(@RequestBody Tienda tienda) {
        return tiendaService.save(tienda);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tiendaService.deleteById(id);
    }
}
