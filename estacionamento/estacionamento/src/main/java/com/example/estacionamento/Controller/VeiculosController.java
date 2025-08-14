package com.example.estacionamento.Controller;

import com.example.estacionamento.Entity.Veiculos;
import com.example.estacionamento.Repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosRepository veiculosRepository;

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

    @PostMapping("/entrada")
    public ResponseEntity<String> liberarEntrada(@RequestBody Veiculos veiculos) {
        veiculosRepository.save(veiculos);
        return ResponseEntity.ok("Veículo liberado!");
    }
}
