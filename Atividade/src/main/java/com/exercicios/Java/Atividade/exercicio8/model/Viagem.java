package com.exercicios.Java.Atividade.exercicio8.model;

public class Viagem{

    private Double distanciaPercorrida;
    private Double combustivelGasto;

    public Double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(Double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public Double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(Double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public Double calcularConsumoMedio() {
        return this.distanciaPercorrida / this.combustivelGasto;
    }
}