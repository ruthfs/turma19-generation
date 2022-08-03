package CadernoExercicios4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que calcule a soma de dez números quaisquer 
		fornecidos pelo usuário
		 */

		Scanner scanner = new Scanner(System.in);
		
		int num, soma;
		
		System.out.println("Calculo da soma de 10 números");
		
		soma=0;
		
		for(int lista=0; lista<10; lista++) {
			System.out.print("Digite um número: ");
			num = scanner.nextInt();
			soma=soma+num;
		}
		
		System.out.printf("A soma dos números é: %d", soma);
	}

}
