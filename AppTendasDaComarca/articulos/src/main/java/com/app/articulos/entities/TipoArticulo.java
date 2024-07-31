package com.app.articulos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Tipos_articulos")
public class TipoArticulo {

    @Id
    @Column(length = 3)
    private String codigo;

    @Column(nullable = false)
    private String tipo;
}
