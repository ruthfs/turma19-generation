package CadernoExercicios7;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Elabore um programa que preencha uma matriz 6 x 4, calcule e
		armazene o maior elemento de cada linha e multiplique cada linha por
		seu respectivo maior elemento. Mostre a matriz resultante.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int [][] numeros = new int [6][4];
		int maior=0;
		
		for(int i=0; i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
				System.out.printf("Digite o número da linha %d e coluna %d", numeros[i], numeros[j]);
			}
		}
		
		System.out.println();
		
		
		for(int i=0; i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
				if(numeros[i][j]>maior) {
					maior = numeros[i][j];
					System.out.print(maior*numeros[i][j]);
				}
				
			}
		}
		
	}

}
