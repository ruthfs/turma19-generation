package CadernoExercicios1;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		Fa�a um programa que receba o n�mero de horas trabalhadas e o valor 
		do sal�rio m�nimo, calcule e mostre o sal�rio a receber seguindo estas 
		regras:a. 
		a hora trabalhada vale um d�cimo do sal�rio m�nimo;
		b. o sal�rio bruto equivale ao n�mero de horas trabalhadas 
		multiplicado pelo valor da hora trabalhada;
		c. o imposto equivale a 3% do sal�rio bruto;
		d. o sal�rio a receber equivale ao sal�rio bruto menos o imposto.
		 */
		
		double hrsTrabalhadas,valorTrabalhadas, salMinimo,salBruto,imposto, total;
		
		System.out.println("Digite o sal�rio minimo: ");
		salMinimo = scanner.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		hrsTrabalhadas = scanner.nextDouble();
		
		valorTrabalhadas = salMinimo/10;
		salBruto = hrsTrabalhadas*valorTrabalhadas;
		imposto = (salBruto*3)/100;
		total = salBruto-imposto;
		
		System.out.println("O salario bruto �: "+salBruto);
		System.out.println("O valor de imposto �: "+imposto);
		System.out.println("O salario total �: "+total);
	}

}
