package com.exercicios.Java.Atividade.exercicio6.controller;

import com.exercicios.Java.Atividade.exercicio6.model.Circulo;

import java.util.Locale;
import java.util.Scanner;

public class CirculoController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Circulo circulo = new Circulo();

        System.out.print("Digite o valor do raio do circulo: ");
        circulo.setRaio(sc.nextDouble());

        Double area = circulo.calcularArea();

        System.out.printf("AREA = %.3f\n", area);

    }
}