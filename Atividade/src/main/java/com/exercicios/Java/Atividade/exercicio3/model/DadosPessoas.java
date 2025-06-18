package com.exercicios.Java.Atividade.exercicio3.model;

public class DadosPessoas  {

    private String nome1;
    private Integer idade1;
    private String nome2;
    private Integer idade2;

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public Integer getIdade1() {
        return idade1;
    }

    public void setIdade1(Integer idade1) {
        this.idade1 = idade1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public Integer getIdade2() {
        return idade2;
    }

    public void setIdade2(Integer idade2) {
        this.idade2 = idade2;
    }

    public Double calcularIdadeMedia() {
        return (double) (this.idade1 + this.idade2) / 2.0;
    }
}