package CadernoExercicios2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		/*
		Construa um programa que leia tr�s valores num�ricos (representados 
		pelas vari�veis A, B e C) e fa�a o c�lculo do delta de uma equa��o de 
		segundo grau, segundo a f�rmula de B�skara. O programa deve mostrar 
		quantas ra�zes reais a equa��o possui (delta < 0 � mostrar uma 
		mensagem dizendo que a equa��o n�o possui ra�zes reais, delta > 0 �
		mostrar que possui duas ra�zes reais, delta = 0 � mostrar que possui 
		uma �nica raiz real). 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C, delta, x1, x2;
		
		System.out.print("Digite um valor numerico: \n");
		A = scanner.nextDouble();
		
		System.out.print("Digite um valor numerico: \n");
		B = scanner.nextDouble();
		
		System.out.print("Digite um valor numerico: \n");
		C = scanner.nextDouble();
		
		delta= (Math.sqrt(B))-(4*A*C);
		
		if(delta<0) {
			System.out.println("A equa��o n�o possui ra�zes.");
		}
		
		if(delta==0) {
			x1=B/2*A;
			System.out.printf("A �nica raiz real �: %.4f",x1);
		}
		
		if(delta>0) {
			x1=(-B + Math.sqrt(delta))/(2*A);
			x2=(-B - Math.sqrt(delta))/(2*A);
			System.out.printf("Duas ra�zes reais - X1: ",x1,", X2: ",x2);
		}

	}

}
