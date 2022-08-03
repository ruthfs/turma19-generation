package CadernoExercicios1;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {

		/*
		Faça um programa que receba o ano de nascimento de uma pessoa e o 
		ano atual, calcule e mostre:
		a. a idade dessa pessoa em anos;
		b. a idade dessa pessoa em meses;
		c. a idade dessa pessoa em dias (considerando que cada ano 
		possui 365 dias);
		d. a idade dessa pessoa em semanas (cada ano possui 52 
		semanas).
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double anoNasc, anoAtual, totalAnos, totalMeses, totalSemanas, totalDias;
		
		System.out.print("Digite o ano de nascimento: ");
		anoNasc = scanner.nextDouble();
		
		System.out.print("Digite o ano atual: ");
		anoAtual = scanner.nextDouble();
		
		totalAnos = anoAtual-anoNasc;
		totalMeses = totalAnos*12;
		totalSemanas = totalAnos*52;
		totalDias = totalAnos*365;
		
		System.out.println("Sua idade aproximada em anos é: "+totalAnos);
		System.out.println("Sua idade aproximada em meses é: "+totalMeses);
		System.out.println("Sua idade aproximada em semanas é: "+totalSemanas);
		System.out.println("Sua idade aproximada em dias é: "+totalDias);
	}

}
