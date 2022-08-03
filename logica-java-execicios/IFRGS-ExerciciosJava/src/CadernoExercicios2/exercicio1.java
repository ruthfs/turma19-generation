package CadernoExercicios2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que leia dois valores numéricos inteiros e apresente 
		o resultado da diferença do maior valor pelo menor valor. Se os valores 
		forem iguais, o programa deve mostrar zero.

		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2,resp;
		
		System.out.print("Digite o primeiro número inteiro: ");
		num1=scanner.nextDouble();
		
		System.out.print("Digite o segundo número inteiro: ");
		num2=scanner.nextDouble();
		
		if(num1>num2) {
			resp=num1-num2;
			System.out.println("A diferença entre o maior e menor numero é: "+resp);
		}
		
		if(num2>num1) {
			resp=num2-num1;
			System.out.println("A diferença entre o maior e menor numero é: "+resp);
		}
		
		if(num1==num2) {
			resp=num1-num2;
			System.out.println("A diferença entre o maior e menor numero é: "+resp+", pois os numeros são iguais");
		}
	}

}
