package Exercicio_de_Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner leitor=new Scanner(System.in);
		
		int num []=new int [10];
		
		
		for (int x=0; x<num.length;x++) {
			System.out.print("Digite um n�mero:");
			num[x]=leitor.nextInt();
			
			if(num[x]%2==0) {
				System.out.println("N�mero par!");
				System.out.println();
			} else {
				System.out.println("N�mero impar!");
				System.out.println();
			}
			
		}
	}

}
