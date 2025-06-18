package com.exercicios.Java.Atividade.exercicio6.model;

public class Circulo {

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}