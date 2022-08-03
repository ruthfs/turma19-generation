package CadernoExercicios1;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que receba uma temperatura em Celsius, calcule e 
		mostre essa temperatura em Fahrenheit. 
		 */
		
		Scanner scanner = new Scanner(System.in);

		double celsius, fahrenheit;
		
		System.out.println("Digite uma temperatura em celsius: ");
		celsius = scanner.nextDouble();
		
		fahrenheit = (9*celsius)/5+32;
		
		System.out.println("A temperatura em fahrenheit é de: "+fahrenheit);
	}

}
