package com.app.articulos.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "Historial_Articulos")
public class HistorialArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historial;

    @ManyToOne
    @JoinColumn(name = "id_articulo", nullable = false)
    private Articulo articulo;

    @Column(nullable = false)
    private String accion;

    @Column(nullable = false)
    private String usuario;

    @Column(columnDefinition = "TEXT")
    private String detalles;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_creacion;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_modificacion;



}