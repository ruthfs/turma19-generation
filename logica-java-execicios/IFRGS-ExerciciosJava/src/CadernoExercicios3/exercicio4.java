package CadernoExercicios3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		Fa�a um programa que receba v�rias idades, calcule e mostre a m�dia 
		das idades digitadas. Finalize digitando idade igual a zero.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int idade, listaIdade, add;
		double media;
		
		System.out.println("M�dia de idades. Para iniciar digite qualquer numero, para sair do programa digite 0.");
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
		System.out.printf("M�dia das idades digitadas: %.2f",media);
	}

}
