package CadernoExercicios6;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que receba o nome de oito clientes de uma
		videolocadora e armazene-os em um vetor. Em um segundo vetor,
		armazene a quantidade de DVDs locados em 2017 por cada um dos oito
		clientes. Sabe-se que, para cada dez loca��es, o cliente tem direito a
		uma loca��o gr�tis. Fa�a um programa que mostre o nome de todos os
		clientes, com a quantidade de loca��es gr�tis a que ele tem direito.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int cont;
		String [] cliente = new String [8];
		int [] qtdGratis = new int [8];
		int [] qtdLoc = new int [8];
		
		for(cont =1; cont<=cliente.length;cont++) {
			System.out.printf("Digite o nome do %d� cliente:",cont);
			cliente[cont-1]=scanner.next();
			System.out.print("Digite a quantidade de loca��es em 2017: ");
			qtdLoc[cont-1]=scanner.nextInt();
		}
		
		for(cont=1;cont<=8;cont++) {
			qtdGratis[cont-1]=qtdLoc[cont-1]/10;
			System.out.printf("\nCliente: %s\nQtd de Loca��es gr�tis: %d", cliente[cont-1],qtdGratis[cont-1]);
		}
	}

}
