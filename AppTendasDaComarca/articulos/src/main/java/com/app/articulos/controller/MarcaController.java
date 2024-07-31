package com.app.articulos.controller;

import com.app.articulos.entities.Marca;
import com.app.articulos.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> findAll() {
        return marcaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Marca> findById(@PathVariable Long id) {
        return marcaService.findById(id);
    }

    @PostMapping
    public Marca save(@RequestBody Marca marca) {
        return marcaService.save(marca);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        marcaService.deleteById(id);
    }
}