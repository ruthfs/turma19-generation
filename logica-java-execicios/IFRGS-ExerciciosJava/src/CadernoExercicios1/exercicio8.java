package CadernoExercicios1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que calcule e mostre a �rea de um tri�ngulo. 
		Sabese que: �rea = (base x altura) / 2. A base e altura devem ser informadas 
		pelo usu�rio.
		 */
		
		Scanner scanner = new Scanner (System.in);
		
		double base, altura, area;
		
		base = scanner.nextDouble();
		
		altura = scanner.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.printf("A �rea do triangulo �: %.3f",area);
	}

}
