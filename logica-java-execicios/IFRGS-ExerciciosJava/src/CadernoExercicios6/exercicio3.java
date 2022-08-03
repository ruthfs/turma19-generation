package CadernoExercicios6;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		/*
		Faça um programa que receba cinco números e mostre a saída a seguir:
		Digite o 1º número: 5
		Digite o 2º número: 3
		Digite o 3º número: 2
		Digite o 4º número: 0
		Digite o 5º número: 2
		Os números digitados foram:
		5 + 3 + 2 + 0 + 2 = 12
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int[] num= new int [5];
		int soma=0, cont;
		
		for ( cont=1; cont<=num.length;cont++) {
			System.out.printf("Digite o %dº número: ", cont);
			num[cont-1]=scanner.nextInt();
			soma += num[cont-1];
		}
		
		System.out.println("Os números digitados foram: ");
		for( cont=1;cont<=5;cont++) {
			System.out.print(num[cont-1]+"+");
		}
		
		System.out.print(soma);
	}

}
