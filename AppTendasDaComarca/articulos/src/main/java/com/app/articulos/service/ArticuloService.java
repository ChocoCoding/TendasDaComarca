package com.app.articulos.service;

import com.app.articulos.entities.Articulo;
import com.app.articulos.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;

    public List<Articulo> findAll() {
        return articuloRepository.findAll();
    }

    public Optional<Articulo> findById(Long id) {
        return articuloRepository.findById(id);
    }

    public Articulo save(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public void deleteById(Long id) {
        articuloRepository.deleteById(id);
    }
}
