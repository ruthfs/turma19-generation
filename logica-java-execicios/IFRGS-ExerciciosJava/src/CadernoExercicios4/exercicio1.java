package CadernoExercicios4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Escreva um programa em Java (utilizando switch) que leiam tr�s n�meros inteiros que representam uma data 
		com dia, m�s e ano respectivamente. O programa deve escrever esta data da 
		seguinte forma:
							dia de nome do m�s de ano (APENAS M�S)
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int mes;
		
		System.out.print("Digite o numero de alguem m�s: ");
		mes=scanner.nextInt();
		
		switch(mes) {
		case 1: System.out.println("Janeiro");break;
		case 2: System.out.println("Fevereiro");break;
		case 3: System.out.println("Mar�o");break;
		case 4: System.out.println("Abril");break;
		case 5: System.out.println("Maio");break;
		case 6: System.out.println("Junho");break;
		case 7: System.out.println("Julho");break;
		case 8: System.out.println("Agosto");break;
		case 9: System.out.println("Setembro");break;
		case 10: System.out.println("Outubro");break;
		case 11: System.out.println("Novembro");break;
		case 12: System.out.println("Dezembro");break;
		default: System.out.println("N�mero Inv�lido");
		}
	
	}

}
