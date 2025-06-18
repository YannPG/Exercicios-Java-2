package com.exercicios.Java.Atividade.exercicio10.controller;

import com.exercicios.Java.Atividade.exercicio10.model.Duracao;

import java.util.Scanner;

public class DuracaoController {

    public void executar(Scanner sc) {
        Duracao duracao = new Duracao();

        System.out.print("Digite a duracao em segundos: ");
        duracao.setTotalSegundos(sc.nextInt());

        duracao.calcularDuracaoFormatada();

        int horas = duracao.getHoras();
        int minutos = duracao.getMinutos();
        int segundos = duracao.getSegundos();

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }
}