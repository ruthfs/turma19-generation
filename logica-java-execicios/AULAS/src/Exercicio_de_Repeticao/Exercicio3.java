package Exercicio_de_Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */

		Scanner leitor = new Scanner(System.in);

		int idade = 0, totalMaior = 0, totalMenor = 0;

		System.out.print("Digite sua idade: ");
		;
		idade = leitor.nextInt();

		while (idade <= 98) {
			System.out.print("Digite sua idade: ");
			idade = leitor.nextInt();

			if (idade < 21) {
				totalMenor += 1;
			} else if (idade > 50) {
				totalMaior += 1;
			}
		}
		System.out.printf("Quantidade de menores de 21 anos: %d \n", totalMenor);
		System.out.printf("Quantidade de maiores de 50 anos: %d \n", totalMaior);

	}

}
