package Exercicio_de_Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner leitor=new Scanner(System.in);
		
		int num []=new int [10];
		
		
		for (int x=0; x<num.length;x++) {
			System.out.print("Digite um número:");
			num[x]=leitor.nextInt();
			
			if(num[x]%2==0) {
				System.out.println("Número par!");
				System.out.println();
			} else {
				System.out.println("Número impar!");
				System.out.println();
			}
			
		}
	}

}
