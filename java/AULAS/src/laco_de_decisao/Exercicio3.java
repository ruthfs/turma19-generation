package laco_de_decisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		 * categoria ela se encontra:
		 * 10-14 infantil
		 * 15-17 juvenil
		 * 18-25 adulto
		 */
		
		Scanner leitor=new Scanner (System.in);
		
		int idade=0;
		
		System.out.print("Digite sua idade, [10 a 25] : ");
		idade=leitor.nextInt();
		
		if (idade >=10 && idade <=14) {
			System.out.printf("Sua idade é %d anos, categoria é Infantil.%n",idade);
		}
		else if (idade >=15 && idade <=17) {
			System.out.printf("Sua idade é %d anos, categoria é Juvenil.%n",idade);
		}
		else if (idade >=18 && idade <=25) {
			System.out.printf("Sua idade é %d anos, categoria Adulto.%n",idade);
		}
		else {
			System.out.println("Você não digitou dentro do parametro, leitura negada.");
		}
	}
}
