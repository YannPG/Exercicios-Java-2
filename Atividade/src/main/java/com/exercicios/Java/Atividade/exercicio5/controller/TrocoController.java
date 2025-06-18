package com.exercicios.Java.Atividade.exercicio5.controller;

import com.exercicios.Java.Atividade.exercicio5.model.Pagamento;

import java.util.Locale;
import java.util.Scanner;

public class TrocoController {

    public void executar(Scanner sc) {
        Locale.setDefault(Locale.US);
        Pagamento pagamento = new Pagamento();

        System.out.print("Preço unitário do produto: ");
        pagamento.setPrecoUnitario(sc.nextDouble());

        System.out.print("Quantidade comprada: ");
        pagamento.setQuantidade(sc.nextInt());

        System.out.print("Dinheiro recebido: ");
        pagamento.setDinheiroRecebido(sc.nextDouble());

        Double troco = pagamento.calcularTroco();

        System.out.printf("TROCO = %.2f\n", troco);

    }
}