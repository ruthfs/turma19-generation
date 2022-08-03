package CadernoExercicios4;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		/*
		Faça um programa que mostre o menu de opções a seguir, receba a opção 
		digitada pelo usuário e os dados necessários para executar cada operação. 
		Note que dependendo da opção escolhida pelo usuário, um conjunto de 
		instruções diferente será executado. DICA: utilize as estruturas escolha e 
		switch para executar conjuntos de instruções diferentes, dependendo da opção 
		escolhida pelo usuário.
		
		Menu de opções:
		1. Somar dois números.
		2. Número ao quadrado.
		Digite a opção desejada
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Menu de opções:");
		System.out.println("1. Somar dois números.");
		System.out.println("2. Número ao quadrado.");
		System.out.print("Digite a opção desejada: ");
		opcao=scanner.nextInt();
		
		switch(opcao) {
		case 1: System.out.println("Você escolheu a opção 1.");break;
		case 2: System.out.println("Você esolheu a opção 2");break;
		default : System.out.println("Número inválido.");
		}
		
	}

}
