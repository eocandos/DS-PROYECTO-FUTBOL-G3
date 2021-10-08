package com.co.futbol.services;

import com.co.futbol.entity.Equipos;
import com.co.futbol.repository.FutbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolServices {

    @Autowired
    FutbolRepository futbolRepository;

    public List<Equipos> obtenerEquipos(){

        return futbolRepository.findAll();
    }

}
