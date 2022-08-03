package CadernoExercicios1;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		/*
		  Sabe-se que:
		  1 pé = 12 polegadas
		  1 jarda = 3 pés
		  1 milha = 1.760 jardas
		  Faça um programa que receba uma medida em pés , faça as 
		  conversões a seguir e mostre os resultados.
		  a. polegadas;
		  b. jardas;
		  c. milhas.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double numPes, totalPolegadas,totalJardas,totalMilhas;
		
		System.out.println("Digite uma medida em pés: ");
		numPes = scanner.nextDouble();
		
		totalPolegadas = numPes*12;
		
		totalJardas= numPes/3;
		
		totalMilhas = numPes/5280;
		
		System.out.println("A medida de " +numPes+ " pés" +" em polegadas é: "+totalPolegadas);
		System.out.println("A medida de " +numPes+ " pés"  + " em jardas é: "+totalJardas);
		System.out.println("A medida de pés de " +numPes+ " pés" + " em milhas é: "+totalMilhas);
	}

}
