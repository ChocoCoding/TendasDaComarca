package com.app.articulos.controller;

import com.app.articulos.entities.HistorialArticulo;
import com.app.articulos.service.HistorialArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/historialArticulos")
public class HistorialArticuloController {
    @Autowired
    private HistorialArticuloService historialArticuloService;

    @GetMapping
    public List<HistorialArticulo> findAll() {
        return historialArticuloService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<HistorialArticulo> findById(@PathVariable Long id) {
        return historialArticuloService.findById(id);
    }

    @GetMapping("/articulo/{articuloId}")
    public List<HistorialArticulo> findByArticuloId(@PathVariable Long articuloId) {
        return historialArticuloService.findByArticuloId(articuloId);
    }

    @PostMapping
    public HistorialArticulo save(@RequestBody HistorialArticulo historialArticulo) {
        return historialArticuloService.save(historialArticulo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        historialArticuloService.deleteById(id);
    }
}
