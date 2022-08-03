package CadernoExercicios1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que calcule e mostre a área de um triângulo. 
		Sabese que: Área = (base x altura) / 2. A base e altura devem ser informadas 
		pelo usuário.
		 */
		
		Scanner scanner = new Scanner (System.in);
		
		double base, altura, area;
		
		base = scanner.nextDouble();
		
		altura = scanner.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.printf("A área do triangulo é: %.3f",area);
	}

}
