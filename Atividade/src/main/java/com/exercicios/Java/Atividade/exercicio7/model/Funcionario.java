package com.exercicios.Java.Atividade.exercicio7.model;

public class Funcionario {

    private String nome;
    private Double valorPorHora;
    private Integer horasTrabalhadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double calcularPagamento() {
        return this.valorPorHora * this.horasTrabalhadas;
    }
}