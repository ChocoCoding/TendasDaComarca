package com.app.articulos.service;



import com.app.articulos.entities.TipoArticulo;
import com.app.articulos.repository.TipoArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoArticuloService {
    @Autowired
    private TipoArticuloRepository tipoArticuloRepository;

    public List<TipoArticulo> findAll() {
        return tipoArticuloRepository.findAll();
    }

    public Optional<TipoArticulo> findByCodigo(String codigo) {
        return Optional.ofNullable(tipoArticuloRepository.findByCodigo(codigo));
    }

    public TipoArticulo save(TipoArticulo tipoArticulo) {
        return tipoArticuloRepository.save(tipoArticulo);
    }

    public void deleteByCodigo(String codigo) {
        tipoArticuloRepository.deleteByCodigo(codigo);
    }
}