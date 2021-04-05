package laco_de_decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

		Scanner leitor=new Scanner (System.in);
		
		int num1=leitor.nextInt(), num2=leitor.nextInt(), num3=leitor.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("O maior número é "+num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("O maior número é "+num2);
		}
		else if (num3>num1 && num3>num2) {
			System.out.println("O maior número é "+num3);
		}
		else {
			System.out.println("Dado Inválido");
		}
	}

}
