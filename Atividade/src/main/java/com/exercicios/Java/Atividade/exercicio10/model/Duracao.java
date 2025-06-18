package com.exercicios.Java.Atividade.exercicio10.model;

public class Duracao {

    private Integer totalSegundos;
    private Integer horas;
    private Integer minutos;
    private Integer segundos;

    public Integer getHoras() {
        return horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setTotalSegundos(Integer totalSegundos) {
        this.totalSegundos = totalSegundos;
    }

    public void calcularDuracaoFormatada() {
        this.horas = this.totalSegundos / 3600;
        int resto = this.totalSegundos % 3600;
        this.minutos = resto / 60;
        this.segundos = resto % 60;
    }
}