package CadernoExercicios1;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// Faça um programa que calcule e mostre a área de um quadrado. Sabese que
		//A =LADO elevado a 2
		
		Scanner scanner = new Scanner(System.in);
		
		double area, lado1,lado2;
		
		lado1 = scanner.nextDouble();
		
		lado2 = scanner.nextDouble();
		
		area = lado1+lado2*2;
		
		System.out.printf("A área do quadrado é: %.2f", area);
		
	}

}
