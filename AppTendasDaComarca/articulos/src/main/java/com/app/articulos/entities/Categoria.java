package com.app.articulos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;

    @Column(nullable = false)
    private String nombre_categoria;
}
