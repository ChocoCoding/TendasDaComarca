package com.app.articulos.service;

import com.app.articulos.entities.Tienda;
import com.app.articulos.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository tiendaRepository;

    public List<Tienda> findAll() {
        return tiendaRepository.findAll();
    }

    public Optional<Tienda> findById(Long id) {
        return tiendaRepository.findById(id);
    }

    public Tienda save(Tienda tienda) {
        return tiendaRepository.save(tienda);
    }

    public void deleteById(Long id) {
        tiendaRepository.deleteById(id);
    }
}