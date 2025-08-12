package com.example.estacionamento.Repository;

import com.example.estacionamento.Entity.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VeiculosRepository extends JpaRepository<Veiculos, Integer> {
    Optional<Veiculos> findByPlaca(String placa);
}
