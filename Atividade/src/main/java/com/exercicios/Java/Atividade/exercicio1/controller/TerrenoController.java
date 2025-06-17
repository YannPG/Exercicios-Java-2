package com.exercicios.Java.Atividade.exercicio1.controller;

import com.exercicios.Java.Atividade.exercicio1.model.Terreno;

import java.util.Locale;
import java.util.Scanner;

public class TerrenoController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Terreno terreno = new Terreno();

        System.out.print("Digite a largura do terreno: ");
        terreno.setLargura(sc.nextDouble());

        System.out.print("Digite o comprimento do terreno: ");
        terreno.setComprimento(sc.nextDouble());

        System.out.print("Digite o valor do metro quadrado: ");
        terreno.setValorMetroQuadrado(sc.nextDouble());

        Double area = terreno.calcularArea();
        Double preco = terreno.calcularPreco(area);

        System.out.println(); // Linha em branco para separar a saída
        System.out.printf("Area do terreno = %.2f\n", area);
        System.out.printf("Preco do terreno = %.2f\n", preco);

    }
}