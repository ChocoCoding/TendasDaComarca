package com.app.articulos.controller;

import com.app.articulos.entities.Categoria;
import com.app.articulos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id) {
        return categoriaRepository.findById(id);
    }

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        categoriaRepository.deleteById(id);
    }
}
