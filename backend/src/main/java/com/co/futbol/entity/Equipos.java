package com.co.futbol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Equipos {

    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String pais;

    @OneToMany
    private List<Jugadores> jugadores;

}
