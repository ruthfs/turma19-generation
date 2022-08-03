package Exemplo;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double celcius; 
		double fahrenheit;
		
		System.out.println("Insira a temperatura em Celsius: ");
		int celsius = leitor.nextInt();
		fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("O valor em fahrenheit é:  "+ fahrenheit);
		
	}

}
