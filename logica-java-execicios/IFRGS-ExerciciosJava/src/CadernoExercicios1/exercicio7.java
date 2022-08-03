package CadernoExercicios1;

import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
		
	/*
	Faça um programa que receba três notas e seus respectivos pesos, 
	calcule e mostre a média ponderada dessas notas. Para calcular a 
	média ponderada, multiplique cada nota por seus respectivos pesos, 
	some todos os resultados e divida pela soma dos pesos. Por exemplo, 
	se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do 
	estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38.
	Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3.
 
	*/

		double nota1,nota2,nota3, peso1, peso2, peso3,somapesos, calculonotas, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = scanner.nextInt();
		
		System.out.println("Digite o peso da primeira nota: ");
		peso1 = scanner.nextInt();
		
		System.out.println("Digite o peso da segunda nota: ");
		peso2= scanner.nextInt();
		
		System.out.println("Digite o peso da terceira nota: ");
		peso3 = scanner.nextInt();
		
		somapesos = peso1 + peso2 + peso3;
		
		calculonotas = ((nota1 * peso1)+(nota2*peso2)+(nota3*peso3));
		
		mediaFinal = calculonotas/somapesos;
		
		System.out.printf("A média final é: %.2f ",mediaFinal);
	}
}
