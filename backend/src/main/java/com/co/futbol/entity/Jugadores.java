package com.co.futbol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jugadores {

    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String posicion;

}
