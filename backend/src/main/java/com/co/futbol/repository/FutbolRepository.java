package com.co.futbol.repository;

import com.co.futbol.entity.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FutbolRepository extends JpaRepository<Equipos, Long> {
}
