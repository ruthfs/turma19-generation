package CadernoExercicios2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		/*
		Desenvolva um programa que leia quatro valores numéricos inteiros e 
		mostre os valores que são divisíveis por 2 e 3.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2,num3,num4, resp1, resp2;
		
		System.out.println("Digite os numeros, separados por enter!");
		
		num1=scanner.nextDouble();
		/*
		num2=scanner.nextDouble();
		num3=scanner.nextDouble();
		num4=scanner.nextDouble();
		*/
		
		if(num1%2==0) {
			System.out.println("É divisivel por 2");
		}
		if(num1%3==0) {
			System.out.println("É divisel por 3");
		}
		
		//acrescentar o if para cada número e obterá o resultado.

	}

}
