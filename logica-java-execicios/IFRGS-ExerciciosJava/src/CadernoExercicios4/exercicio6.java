package CadernoExercicios4;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		/*
		Fa�a um programa que mostre o menu de op��es a seguir, receba a op��o 
		digitada pelo usu�rio e os dados necess�rios para executar cada opera��o. 
		Note que dependendo da op��o escolhida pelo usu�rio, um conjunto de 
		instru��es diferente ser� executado. DICA: utilize as estruturas escolha e 
		switch para executar conjuntos de instru��es diferentes, dependendo da op��o 
		escolhida pelo usu�rio.
		
		Menu de op��es:
		1. Somar dois n�meros.
		2. N�mero ao quadrado.
		Digite a op��o desejada
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Menu de op��es:");
		System.out.println("1. Somar dois n�meros.");
		System.out.println("2. N�mero ao quadrado.");
		System.out.print("Digite a op��o desejada: ");
		opcao=scanner.nextInt();
		
		switch(opcao) {
		case 1: System.out.println("Voc� escolheu a op��o 1.");break;
		case 2: System.out.println("Voc� esolheu a op��o 2");break;
		default : System.out.println("N�mero inv�lido.");
		}
		
	}

}
