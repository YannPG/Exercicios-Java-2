package com.exercicios.Java.Atividade.exercicio1.model;

public class Terreno {

    private Double largura;
    private Double comprimento;
    private Double valorMetroQuadrado;

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getValorMetroQuadrado() {
        return valorMetroQuadrado;
    }

    public void setValorMetroQuadrado(Double valorMetroQuadrado) {
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    public Double calcularArea() {
        return this.largura * this.comprimento;
    }

    public Double calcularPreco(Double area) {
        return area * this.valorMetroQuadrado;
    }
}