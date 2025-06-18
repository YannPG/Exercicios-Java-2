package com.exercicios.Java.Atividade.exercicio5.model;

public class Pagamento {

    private Double precoUnitario;
    private Integer quantidade;
    private Double dinheiroRecebido;

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDinheiroRecebido() {
        return dinheiroRecebido;
    }

    public void setDinheiroRecebido(Double dinheiroRecebido) {
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public Double calcularTroco() {
        double totalCompra = this.precoUnitario * this.quantidade;
        return this.dinheiroRecebido - totalCompra;
    }
}