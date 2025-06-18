package com.exercicios.Java.Atividade.exercicio4.controller;

import com.exercicios.Java.Atividade.exercicio4.model.Soma;

import java.util.Scanner;

public class SomaController {

    public void executar(Scanner sc) {
        Soma soma = new Soma();

        System.out.print("Digite o valor de X: ");
        soma.setX(sc.nextInt());

        System.out.print("Digite o valor de Y: ");
        soma.setY(sc.nextInt());

        Integer resultado = soma.calcularSoma();

        System.out.println("SOMA = " + resultado);

    }
}