package CadernoExercicios6;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		/*
		Fa�a um programa que receba cinco n�meros e mostre a sa�da a seguir:
		Digite o 1� n�mero: 5
		Digite o 2� n�mero: 3
		Digite o 3� n�mero: 2
		Digite o 4� n�mero: 0
		Digite o 5� n�mero: 2
		Os n�meros digitados foram:
		5 + 3 + 2 + 0 + 2 = 12
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int[] num= new int [5];
		int soma=0, cont;
		
		for ( cont=1; cont<=num.length;cont++) {
			System.out.printf("Digite o %d� n�mero: ", cont);
			num[cont-1]=scanner.nextInt();
			soma += num[cont-1];
		}
		
		System.out.println("Os n�meros digitados foram: ");
		for( cont=1;cont<=5;cont++) {
			System.out.print(num[cont-1]+"+");
		}
		
		System.out.print(soma);
	}

}
