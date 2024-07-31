package com.app.articulos.service;

import com.app.articulos.entities.HistorialArticulo;
import com.app.articulos.repository.HistorialArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialArticuloService {
    @Autowired
    private HistorialArticuloRepository historialArticuloRepository;

    public List<HistorialArticulo> findAll() {
        return historialArticuloRepository.findAll();
    }

    public Optional<HistorialArticulo> findById(Long id) {
        return historialArticuloRepository.findById(id);
    }

    public List<HistorialArticulo> findByArticuloId(Long articuloId) {
        return historialArticuloRepository.findByArticuloId(articuloId);
    }

    public HistorialArticulo save(HistorialArticulo historialArticulo) {
        return historialArticuloRepository.save(historialArticulo);
    }

    public void deleteById(Long id) {
        historialArticuloRepository.deleteById(id);
    }
}
