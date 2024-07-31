package com.app.articulos.repository;


import com.app.articulos.entities.TipoArticulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoArticuloRepository extends JpaRepository<TipoArticulo,String> {

    TipoArticulo findByCodigo(String codigo);
    void deleteByCodigo(String codigo);
}
