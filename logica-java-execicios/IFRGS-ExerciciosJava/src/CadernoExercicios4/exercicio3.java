package CadernoExercicios4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que calcule a soma de dez n�meros quaisquer 
		fornecidos pelo usu�rio
		 */

		Scanner scanner = new Scanner(System.in);
		
		int num, soma;
		
		System.out.println("Calculo da soma de 10 n�meros");
		
		soma=0;
		
		for(int lista=0; lista<10; lista++) {
			System.out.print("Digite um n�mero: ");
			num = scanner.nextInt();
			soma=soma+num;
		}
		
		System.out.printf("A soma dos n�meros �: %d", soma);
	}

}
