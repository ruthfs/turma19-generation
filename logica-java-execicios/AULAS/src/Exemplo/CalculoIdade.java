package Exemplo;

import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); //instanciar - criar
	
		int valor1, valor2, soma;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = leitor.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = leitor.nextInt();
		
		//processamento
		soma=valor1+valor2;
		
		//saida
		System.out.println("A soma é: "+ soma);
		
	}

}
