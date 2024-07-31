package com.app.articulos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;

    @Column(nullable = false)
    private String nombre_marca;
}
