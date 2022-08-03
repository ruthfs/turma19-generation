package CadernoExercicios3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		Crie um programa Java para exibir os números digitados 
		pelo usuário, até que ele digite um número negativo.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num, numlista;
		
		System.out.println("Digite um número: ");
		num=scanner.nextInt();
		
		numlista=0;
		
		while(num>=0) {
			System.out.printf("Você digitou: %d \n", num);
			
			num=scanner.nextInt();
			numlista=numlista+1;
			
		}

		System.out.println("Você digitou um número negativo. Fim do programa!");
	}

}
