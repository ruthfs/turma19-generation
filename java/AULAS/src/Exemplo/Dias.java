/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */


package Exemplo;

import java.util.Scanner;

public class Dias {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int ano, mes, dia, diaTotal;
		
		System.out.print("Quantos anos voc� tem ? ");
		ano = leitor.nextInt();
		System.out.print("Quantos meses voc� tem ? ");
		mes = leitor.nextInt();
		System.out.print("Quantos dias voc� tem ? ");
		dia = leitor.nextInt();		
		
		//processamento
		diaTotal = (ano * 365) + (mes * 30) + dia;
		System.out.print(diaTotal);
	}

}
