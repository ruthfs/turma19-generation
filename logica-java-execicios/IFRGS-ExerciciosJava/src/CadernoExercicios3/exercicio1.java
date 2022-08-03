package CadernoExercicios3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que calcule a soma de dez números quaisquer 
		fornecidos pelo usuário
		 */
		
		Scanner scanner = new Scanner(System.in);
	
		int num,listanum,soma;
		
		System.out.println("Calculo de soma de 10 números");
		
		soma = 0;
		listanum=0;
		
		while(listanum<10) {
			
			System.out.printf("Número: %d ", listanum+1);
			
			num = scanner.nextInt();
			
			soma = soma + num;
			
			listanum = listanum + 1;
			
		}
		
		System.out.printf("A soma dos números é: %d", soma);
	}

}
