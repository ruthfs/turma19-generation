package CadernoExercicios1;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule e mostre a �rea de um quadrado. Sabese que
		//A =LADO elevado a 2
		
		Scanner scanner = new Scanner(System.in);
		
		double area, lado1,lado2;
		
		lado1 = scanner.nextDouble();
		
		lado2 = scanner.nextDouble();
		
		area = lado1+lado2*2;
		
		System.out.printf("A �rea do quadrado �: %.2f", area);
		
	}

}
