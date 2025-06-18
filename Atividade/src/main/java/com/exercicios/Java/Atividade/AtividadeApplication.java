package com.exercicios.Java.Atividade;

import com.exercicios.Java.Atividade.exercicio1.controller.TerrenoController;
import com.exercicios.Java.Atividade.exercicio10.controller.DuracaoController;
import com.exercicios.Java.Atividade.exercicio2.controller.RetanguloController;
import com.exercicios.Java.Atividade.exercicio3.controller.IdadesController;
import com.exercicios.Java.Atividade.exercicio4.controller.SomaController;
import com.exercicios.Java.Atividade.exercicio5.controller.TrocoController;
import com.exercicios.Java.Atividade.exercicio6.controller.CirculoController;
import com.exercicios.Java.Atividade.exercicio7.controller.PagamentoController;
import com.exercicios.Java.Atividade.exercicio8.controller.ConsumoController;
import com.exercicios.Java.Atividade.exercicio9.controller.MedidasController;
import java.util.Scanner;

public class AtividadeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("\n--- ESTRUTURA SEQUENCIAL - EXERCÍCIOS ---");
			System.out.println("1. Terreno");
			System.out.println("2. Retângulo");
			System.out.println("3. Idades");
			System.out.println("4. Soma");
			System.out.println("5. Troco");
			System.out.println("6. Círculo");
			System.out.println("7. Pagamento");
			System.out.println("8. Consumo");
			System.out.println("9. Medidas");
			System.out.println("10. Duração");
			System.out.println("0. Sair");
			System.out.print("\nDigite o número do exercício: ");

			escolha = sc.nextInt();
			System.out.println("-----------------------------------------");

			switch (escolha) {
				case 1:
					new TerrenoController().executar(sc);
					break;
				case 2:
					new RetanguloController().executar(sc);
					break;
				case 3:
					new IdadesController().executar(sc);
					break;
				case 4:
					new SomaController().executar(sc);
					break;
				case 5:
					new TrocoController().executar(sc);
					break;
				case 6:
					new CirculoController().executar(sc);
					break;
				case 7:
					new PagamentoController().executar(sc);
					break;
				case 8:
					new ConsumoController().executar(sc);
					break;
				case 9:
					new MedidasController().executar(sc);
					break;
				case 10:
					new DuracaoController().executar(sc);
					break;
				case 0:
					System.out.println("Programa encerrado.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}

		} while (escolha != 0);

		sc.close();
	}
}