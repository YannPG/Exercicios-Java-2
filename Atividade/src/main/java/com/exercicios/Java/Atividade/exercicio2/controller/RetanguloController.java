package com.exercicios.Java.Atividade.exercicio2.controller;

import com.exercicios.Java.Atividade.exercicio2.model.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();

        System.out.print("Base do retangulo: ");
        retangulo.setBase(sc.nextDouble());

        System.out.print("Altura do retangulo: ");
        retangulo.setAltura(sc.nextDouble());

        Double area = retangulo.calcularArea();
        Double perimetro = retangulo.calcularPerimetro();
        Double diagonal = retangulo.calcularDiagonal();

        System.out.println();
        System.out.printf("AREA = %.4f\n", area);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);

    }
}