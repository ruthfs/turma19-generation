package CadernoExercicios1;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		Faça um programa que receba o número de horas trabalhadas e o valor 
		do salário mínimo, calcule e mostre o salário a receber seguindo estas 
		regras:a. 
		a hora trabalhada vale um décimo do salário mínimo;
		b. o salário bruto equivale ao número de horas trabalhadas 
		multiplicado pelo valor da hora trabalhada;
		c. o imposto equivale a 3% do salário bruto;
		d. o salário a receber equivale ao salário bruto menos o imposto.
		 */
		
		double hrsTrabalhadas,valorTrabalhadas, salMinimo,salBruto,imposto, total;
		
		System.out.println("Digite o salário minimo: ");
		salMinimo = scanner.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		hrsTrabalhadas = scanner.nextDouble();
		
		valorTrabalhadas = salMinimo/10;
		salBruto = hrsTrabalhadas*valorTrabalhadas;
		imposto = (salBruto*3)/100;
		total = salBruto-imposto;
		
		System.out.println("O salario bruto é: "+salBruto);
		System.out.println("O valor de imposto é: "+imposto);
		System.out.println("O salario total é: "+total);
	}

}
