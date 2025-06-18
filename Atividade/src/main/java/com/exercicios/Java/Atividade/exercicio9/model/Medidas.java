package com.exercicios.Java.Atividade.exercicio9.model;

public class Medidas {

    private Double a;
    private Double b;
    private Double c;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double calcularAreaQuadrado() {
        return Math.pow(this.a, 2);
    }

    public Double calcularAreaTriangulo() {
        return (this.a * this.b) / 2.0;
    }

    public Double calcularAreaTrapezio() {
        return ((this.a + this.b) * this.c) / 2.0;
    }
}