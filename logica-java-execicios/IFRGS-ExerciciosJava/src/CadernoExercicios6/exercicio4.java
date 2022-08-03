package CadernoExercicios6;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia dois vetores (A e B) com cinco posições. Cada vetor
		 * deverá armazenar números inteiros. O programa deve, então, subtrair o
		 * primeiro elemento de A do último de B, acumulando o valor; subtrair o segundo
		 * elemento de A do penúltimo de B, acumulando o valor, e assim por diante. Ao
		 * final, mostre o resultado de todas as subtrações realizadas.
		 */

		Scanner scanner = new Scanner(System.in);

		int[] A = new int[5];
		int[] B = new int[5];
		int soma=0, cont;
		
		for(cont=1;cont<=B.length;cont++) {
			System.out.print("Digite o %d valor de A: ");
			A[cont-1]=scanner.nextInt();
		}
		
		for(cont=1;cont<=B.length;cont++) {
			System.out.print("Digite o %d valor de B: ");
			B[cont-1]=scanner.nextInt();
		}
		
		for(cont=1;cont<=2;cont++) {
			soma = soma + (A[cont] - B[6-cont]);
		}
		
		System.out.printf("Total: %d", soma);
		
	}

}
