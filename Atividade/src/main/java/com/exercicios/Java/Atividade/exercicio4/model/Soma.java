package com.exercicios.Java.Atividade.exercicio4.model;

public class Soma {

    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer calcularSoma() {
        return this.x + this.y;
    }
}