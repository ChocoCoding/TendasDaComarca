package com.app.articulos.controller;

import com.app.articulos.entities.TipoArticulo;
import com.app.articulos.service.TipoArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipoArticulos")
public class TipoArticuloController {
    @Autowired
    private TipoArticuloService tipoArticuloService;

    @GetMapping
    public List<TipoArticulo> findAll() {
        return tipoArticuloService.findAll();
    }

    @GetMapping("/{codigo}")
    public Optional<TipoArticulo> findById(@PathVariable String codigo) {
        return tipoArticuloService.findByCodigo(codigo);
    }

    @PostMapping
    public TipoArticulo save(@RequestBody TipoArticulo tipoArticulo) {
        return tipoArticuloService.save(tipoArticulo);
    }

    @DeleteMapping("/{codigo}")
    public void deleteById(@PathVariable String codigo) {
        tipoArticuloService.deleteByCodigo(codigo);
    }
}