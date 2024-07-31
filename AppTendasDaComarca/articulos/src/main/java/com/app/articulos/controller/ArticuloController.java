package com.app.articulos.controller;

import com.app.articulos.entities.Articulo;
import com.app.articulos.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public List<Articulo> findAll() {
        return articuloService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Articulo> findById(@PathVariable Long id) {
        return articuloService.findById(id);
    }

    @PostMapping
    public Articulo save(@RequestBody Articulo articulo) {
        return articuloService.save(articulo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        articuloService.deleteById(id);
    }
}
