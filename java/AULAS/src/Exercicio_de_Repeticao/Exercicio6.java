package Exercicio_de_Repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */

		Scanner leitor = new Scanner(System.in);

		double numeros, numMultTres = 0, mediaTotal = 0, soma = 0;

		do {
			System.out.print("Digite um n�mero inteiro: ");
			numeros = leitor.nextInt();

			if (numeros % 3 == 0) {
				soma += numeros;
				numMultTres++;
			}
		} while (numeros != 0);
		mediaTotal = soma / (numMultTres - 1);
		System.out.printf("A m�dia dos multiplos de 3 �: %.2f ", mediaTotal);
	}
}
