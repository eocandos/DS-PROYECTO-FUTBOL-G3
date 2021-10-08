package com.co.futbol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FutbolController {

    @GetMapping("/equipos")
    public String obtenerTodosLosEquipos() {

        return "Funcionando correctamente";
    }

}
