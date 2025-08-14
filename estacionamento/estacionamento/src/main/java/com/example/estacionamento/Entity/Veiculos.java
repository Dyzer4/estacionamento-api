package com.example.estacionamento.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "veiculos")
public class Veiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String placa;

    @Column(nullable = false)
    private LocalTime horarioEntrada;

    @Column(nullable = false)
    private LocalDate dataEntrada;

    @Column
    private LocalTime horarioSaida;

    @Column
    private LocalDate dataSaida;

    @Column
    private String formaPag;

    @Column
    private Integer valorPago;

    public Veiculos() {
    }

    public Veiculos(String placa, LocalTime horarioEntrada, LocalDate dataEntrada, LocalTime horarioSaida, LocalDate dataSaida, String formaPag, Integer valorPago) {
        this.placa = placa;
        this.horarioEntrada = horarioEntrada;
        this.dataEntrada = dataEntrada;
        this.horarioSaida = horarioSaida;
        this.dataSaida = dataSaida;
        this.formaPag = formaPag;
        this.valorPago = valorPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalTime getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalTime getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(LocalTime horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }


    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFormaPag() {
        return formaPag != null ? formaPag : "--";
    }

    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }

    public int getValorPago() {
        return valorPago != null ? valorPago : 0;
    }

    public void setValorPago(Integer valorPago) {
        this.valorPago = valorPago;
    }
}
