package com.app.articulos.repository;

import com.app.articulos.entities.HistorialArticulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistorialArticuloRepository extends JpaRepository<HistorialArticulo, Long> {
    List<HistorialArticulo> findByArticuloId(Long articuloId);
}