package com.co.futbol.controller;

import com.co.futbol.entity.Equipos;
import com.co.futbol.services.FutbolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FutbolController {

    @Autowired
    FutbolServices futbolServices;

    @GetMapping("/equipos")
    public List<Equipos> obtenerTodosLosEquipos() {
        return futbolServices.obtenerEquipos();
    }

}
