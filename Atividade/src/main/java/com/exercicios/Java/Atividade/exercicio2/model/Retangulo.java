package com.exercicios.Java.Atividade.exercicio2.model;

public class Retangulo {

    private Double base;
    private Double altura;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double calcularArea() {
        return this.base * this.altura;
    }

    public Double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    public Double calcularDiagonal() {
        return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }
}