package CadernoExercicios2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que leia dois valores num�ricos inteiros e apresente 
		o resultado da diferen�a do maior valor pelo menor valor. Se os valores 
		forem iguais, o programa deve mostrar zero.

		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2,resp;
		
		System.out.print("Digite o primeiro n�mero inteiro: ");
		num1=scanner.nextDouble();
		
		System.out.print("Digite o segundo n�mero inteiro: ");
		num2=scanner.nextDouble();
		
		if(num1>num2) {
			resp=num1-num2;
			System.out.println("A diferen�a entre o maior e menor numero �: "+resp);
		}
		
		if(num2>num1) {
			resp=num2-num1;
			System.out.println("A diferen�a entre o maior e menor numero �: "+resp);
		}
		
		if(num1==num2) {
			resp=num1-num2;
			System.out.println("A diferen�a entre o maior e menor numero �: "+resp+", pois os numeros s�o iguais");
		}
	}

}
