package CadernoExercicios1;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		/*
		  Sabe-se que:
		  1 p� = 12 polegadas
		  1 jarda = 3 p�s
		  1 milha = 1.760 jardas
		  Fa�a um programa que receba uma medida em p�s , fa�a as 
		  convers�es a seguir e mostre os resultados.
		  a. polegadas;
		  b. jardas;
		  c. milhas.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double numPes, totalPolegadas,totalJardas,totalMilhas;
		
		System.out.println("Digite uma medida em p�s: ");
		numPes = scanner.nextDouble();
		
		totalPolegadas = numPes*12;
		
		totalJardas= numPes/3;
		
		totalMilhas = numPes/5280;
		
		System.out.println("A medida de " +numPes+ " p�s" +" em polegadas �: "+totalPolegadas);
		System.out.println("A medida de " +numPes+ " p�s"  + " em jardas �: "+totalJardas);
		System.out.println("A medida de p�s de " +numPes+ " p�s" + " em milhas �: "+totalMilhas);
	}

}
