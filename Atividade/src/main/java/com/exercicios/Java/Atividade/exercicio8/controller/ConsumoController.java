package com.exercicios.Java.Atividade.exercicio8.controller;

import com.exercicios.Java.Atividade.exercicio8.model.Viagem;

import java.util.Locale;
import java.util.Scanner;

public class ConsumoController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Viagem viagem = new Viagem();

        System.out.print("Distancia percorrida: ");
        viagem.setDistanciaPercorrida(sc.nextDouble());

        System.out.print("Combustível gasto: ");
        viagem.setCombustivelGasto(sc.nextDouble());

        Double consumoMedio = viagem.calcularConsumoMedio();

        System.out.printf("Consumo medio = %.3f\n", consumoMedio);

    }
}