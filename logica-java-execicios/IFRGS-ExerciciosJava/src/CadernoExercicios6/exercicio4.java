package CadernoExercicios6;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia dois vetores (A e B) com cinco posi��es. Cada vetor
		 * dever� armazenar n�meros inteiros. O programa deve, ent�o, subtrair o
		 * primeiro elemento de A do �ltimo de B, acumulando o valor; subtrair o segundo
		 * elemento de A do pen�ltimo de B, acumulando o valor, e assim por diante. Ao
		 * final, mostre o resultado de todas as subtra��es realizadas.
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
