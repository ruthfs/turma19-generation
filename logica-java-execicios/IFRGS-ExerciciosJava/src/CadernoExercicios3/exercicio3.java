package CadernoExercicios3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		Crie um programa Java para exibir os n�meros digitados 
		pelo usu�rio, at� que ele digite um n�mero negativo.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num, numlista;
		
		System.out.println("Digite um n�mero: ");
		num=scanner.nextInt();
		
		numlista=0;
		
		while(num>=0) {
			System.out.printf("Voc� digitou: %d \n", num);
			
			num=scanner.nextInt();
			numlista=numlista+1;
			
		}

		System.out.println("Voc� digitou um n�mero negativo. Fim do programa!");
	}

}
