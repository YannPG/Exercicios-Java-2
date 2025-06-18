package com.exercicios.Java.Atividade.exercicio3.controller;

import com.exercicios.Java.Atividade.exercicio3.model.DadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class IdadesController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        DadosPessoas dadosPessoas = new DadosPessoas();

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        dadosPessoas.setNome1(sc.nextLine());
        System.out.print("Idade: ");
        dadosPessoas.setIdade1(sc.nextInt());

        sc.nextLine();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        dadosPessoas.setNome2(sc.nextLine());
        System.out.print("Idade: ");
        dadosPessoas.setIdade2(sc.nextInt());

        Double media = dadosPessoas.calcularIdadeMedia();
        String nome1 = dadosPessoas.getNome1();
        String nome2 = dadosPessoas.getNome2();

        System.out.println();
        System.out.printf("A idade média de %s e %s é de %.1f anos\n", nome1, nome2, media);

    }
}