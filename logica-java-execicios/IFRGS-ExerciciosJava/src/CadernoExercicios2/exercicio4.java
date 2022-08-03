package CadernoExercicios2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		/*
		Construa um programa que leia três valores para os lados de um 
		triângulo (A, B e C). O programa deve verificar se os lados fornecidos 
		formam realmente um triângulo. Em caso positivo, deve mostrar a 
		mensagem “Os lados formam um triângulo” e caso contrário “Os valores 
		informados não podem formar um triângulo”. Para que três valores de 
		lados formem um triângulo, cada par de lados somados não pode ser 
		menor ou igual ao terceiro lado.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int lado1,lado2,lado3, resp;
		
		System.out.println("Digite o valor para um lado do triangulo");
		lado1= scanner.nextInt();
		
		System.out.println("Digite o valor para um lado do triangulo");
		lado2= scanner.nextInt();

		System.out.println("Digite o valor para um lado do triangulo");
		lado3= scanner.nextInt();
		
		resp=lado1+lado2;
		
		if(resp>lado3 || resp==lado3) {
			System.out.println("Os valores informados não formam um triangulo!");
		}
		else {
			System.out.println("Os lados formam um triangulo!");
		}
	}

}
