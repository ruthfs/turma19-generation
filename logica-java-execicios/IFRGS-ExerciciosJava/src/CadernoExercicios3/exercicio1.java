package CadernoExercicios3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que calcule a soma de dez n�meros quaisquer 
		fornecidos pelo usu�rio
		 */
		
		Scanner scanner = new Scanner(System.in);
	
		int num,listanum,soma;
		
		System.out.println("Calculo de soma de 10 n�meros");
		
		soma = 0;
		listanum=0;
		
		while(listanum<10) {
			
			System.out.printf("N�mero: %d ", listanum+1);
			
			num = scanner.nextInt();
			
			soma = soma + num;
			
			listanum = listanum + 1;
			
		}
		
		System.out.printf("A soma dos n�meros �: %d", soma);
	}

}
