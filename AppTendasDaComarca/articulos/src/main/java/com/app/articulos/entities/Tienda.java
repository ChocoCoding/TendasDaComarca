package com.app.articulos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Tiendas")
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tienda;

    @Column(nullable = false)
    private String nombre_tienda;
}
