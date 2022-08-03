package CadernoExercicios2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		/*
		Construa um programa que leia três valores numéricos (representados 
		pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de 
		segundo grau, segundo a fórmula de Báskara. O programa deve mostrar 
		quantas raízes reais a equação possui (delta < 0 – mostrar uma 
		mensagem dizendo que a equação não possui raízes reais, delta > 0 –
		mostrar que possui duas raízes reais, delta = 0 – mostrar que possui 
		uma única raiz real). 
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
			System.out.println("A equação não possui raízes.");
		}
		
		if(delta==0) {
			x1=B/2*A;
			System.out.printf("A única raiz real é: %.4f",x1);
		}
		
		if(delta>0) {
			x1=(-B + Math.sqrt(delta))/(2*A);
			x2=(-B - Math.sqrt(delta))/(2*A);
			System.out.printf("Duas raízes reais - X1: ",x1,", X2: ",x2);
		}

	}

}
