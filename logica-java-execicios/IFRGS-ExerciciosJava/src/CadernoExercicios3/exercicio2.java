package CadernoExercicios3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que calcule o somatório, a soma dos quadrados e a 
		média entre os n primeiros números inteiros positivos.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double num, media, soma, listanum;
		
		System.out.print("Soma dos quadrados e média entre os numeros");
		
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
		
		System.out.println("A soma dos lados do quadrado é: "+ soma);
		System.out.println("A média dos números é: "+ media);

	}

}
