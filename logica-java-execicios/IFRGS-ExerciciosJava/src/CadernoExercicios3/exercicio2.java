package CadernoExercicios3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que calcule o somat�rio, a soma dos quadrados e a 
		m�dia entre os n primeiros n�meros inteiros positivos.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double num, media, soma, listanum;
		
		System.out.print("Soma dos quadrados e m�dia entre os numeros");
		
		soma=0;
		listanum=0;
		num=0;
		
		while(listanum<4) {
			System.out.println("Lado do quadrado: "+ listanum+1);
			soma=soma+num;
			listanum = listanum+1;
			num = scanner.nextDouble();
		}
		
		media = soma/listanum;
		
		System.out.println("A soma dos lados do quadrado �: "+ soma);
		System.out.println("A m�dia dos n�meros �: "+ media);

	}

}
