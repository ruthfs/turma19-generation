package CadernoExercicios4;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		/*
		 Fa�a um algoritmo e um programa, utilizando as estruturas repita e do..while
		que repita a leitura de uma senha at� que o usu�rio digite o n�mero 1234. Ap�s 
		isso, mostrar a mensagem �Senha correta, acesso liberado.�
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int senha;
		
		do {
			System.out.print("Digite a senha: ");
			senha=scanner.nextInt();
		} while (senha!=1234);

		System.out.println("Senha CORRETA! Acesso liberado.");
	}

}
