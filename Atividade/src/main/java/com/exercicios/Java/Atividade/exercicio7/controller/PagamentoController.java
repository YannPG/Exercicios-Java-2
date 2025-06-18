package com.exercicios.Java.Atividade.exercicio7.controller;

import com.exercicios.Java.Atividade.exercicio7.model.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class PagamentoController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.setNome(sc.nextLine());

        System.out.print("Valor por hora: ");
        funcionario.setValorPorHora(sc.nextDouble());

        System.out.print("Horas trabalhadas: ");
        funcionario.setHorasTrabalhadas(sc.nextInt());

        Double pagamento = funcionario.calcularPagamento();
        String nome = funcionario.getNome();

        System.out.printf("O pagamento para %s deve ser %.2f\n", nome, pagamento);

    }
}