package laco_de_decisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
	 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	 * ímpar exiba o número elevado ao quadrado.
	 */
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner (System.in);
		
		double num=0.0;
		
		System.out.println("Digite um número: ");
		num=leitor.nextDouble();
		
		if (num%2==0) {
			System.out.printf("Número Par! A raiz quadrada deste número é %.2f: %n",Math.sqrt(num));
		}
		else if (num%2!=0) {
			System.out.printf("Número Impar! O resultado deste número elevado ao quadrado é %.2f: ", Math.pow(num,2));
		}
		
	}

}
