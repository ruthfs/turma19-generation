package laco_de_decisao;

import java.util.Scanner;

import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner leitor = new Scanner(System.in);

		int num1 = leitor.nextInt(), num2 = leitor.nextInt(), num3 = leitor.nextInt();

		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else if (num1 < num3) {
				System.out.println(num1 + " " + num3 + " " + num2);
			} else {
				System.out.println(num3 + " " + num1 + " " + num2);
			}
		} else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		} else {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
	}

}
