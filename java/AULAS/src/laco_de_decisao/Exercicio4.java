package laco_de_decisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	 * �mpar exiba o n�mero elevado ao quadrado.
	 */
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner (System.in);
		
		double num=0.0;
		
		System.out.println("Digite um n�mero: ");
		num=leitor.nextDouble();
		
		if (num%2==0) {
			System.out.printf("N�mero Par! A raiz quadrada deste n�mero � %.2f: %n",Math.sqrt(num));
		}
		else if (num%2!=0) {
			System.out.printf("N�mero Impar! O resultado deste n�mero elevado ao quadrado � %.2f: ", Math.pow(num,2));
		}
		
	}

}
