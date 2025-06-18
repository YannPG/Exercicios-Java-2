package com.exercicios.Java.Atividade.exercicio9.controller;

import com.exercicios.Java.Atividade.exercicio9.model.Medidas;

import java.util.Locale;
import java.util.Scanner;

public class MedidasController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Medidas medidas = new Medidas();

        System.out.print("Digite a medida A: ");
        medidas.setA(sc.nextDouble());

        System.out.print("Digite a medida B: ");
        medidas.setB(sc.nextDouble());

        System.out.print("Digite a medida C: ");
        medidas.setC(sc.nextDouble());

        Double areaQuadrado = medidas.calcularAreaQuadrado();
        Double areaTriangulo = medidas.calcularAreaTriangulo();
        Double areaTrapezio = medidas.calcularAreaTrapezio();

        System.out.printf("AREA DO QUADRADO = %.4f\n", areaQuadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f\n", areaTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaTrapezio);

    }
}