package CadernoExercicios3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		Faça um programa que receba várias idades, calcule e mostre a média 
		das idades digitadas. Finalize digitando idade igual a zero.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int idade, listaIdade, add;
		double media;
		
		System.out.println("Média de idades. Para iniciar digite qualquer numero, para sair do programa digite 0.");
		idade=scanner.nextInt();
		add=0;
		listaIdade=0;
		
		while(idade>0) {
			System.out.printf("Idade %d :", listaIdade+1);
			idade=scanner.nextInt();
			add = add+idade;
			listaIdade=listaIdade+1;
		}
		
		media=(double)add/listaIdade;
		System.out.printf("Média das idades digitadas: %.2f",media);
	}

}
