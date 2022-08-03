/*
 * 3. Faça um sistema que leia o tempo de duração de um
 *  evento em uma fábrica expressa em segundos e mostre-o 
 *  expresso em horas, minutos e segundos. 
 *  f% double - %.2f
 *  %d int
 *  %s String
 *  %c caracter
 */


package Exemplo;

import java.util.Scanner;

public class TempoSegundos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//variaveis
		double tempoDuracao, horas, minutos, segundos;
		
		System.out.print("Quanto tempo durará o evento expresso em segundos ? ");
		tempoDuracao = leitor.nextInt();
		
		horas = tempoDuracao / 3600;
		minutos = ((tempoDuracao % 3600)/60);
		segundos = ((tempoDuracao % 3600) % 60);
		
		System.out.printf("Horas: %.0f \nMinutos: %.0f \nSegundos: %.0f", horas, minutos, segundos);

	}

}
