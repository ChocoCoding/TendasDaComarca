package com.app.articulos.repository;

import com.app.articulos.entities.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda,Long> {
}
