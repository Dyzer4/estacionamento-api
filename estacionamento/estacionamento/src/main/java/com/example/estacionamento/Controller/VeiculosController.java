package com.example.estacionamento.Controller;

import com.example.estacionamento.Entity.Veiculos;
import com.example.estacionamento.Repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosRepository veiculosRepository;  // Renomeei para 'veiculosRepository' para clareza

    @GetMapping
    public List<Veiculos> listarVeiculos() {
        return veiculosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Veiculos pesquisarVeiculo(@PathVariable int id) {
        return veiculosRepository.findById(id).orElse(null);
    }

    @GetMapping("/placa/{placa}")
    public Veiculos pesquisarVeiculoPorPlaca(@PathVariable String placa) {
        return veiculosRepository.findByPlaca(placa).orElse(null);
    }
}
