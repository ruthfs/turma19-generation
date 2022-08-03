package CadernoExercicios1;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
		Faça um programa que receba o valor do salário mínimo e a quantidade 
		de quilowatts consumida por uma residência, calcule e mostre:
		a. o valor de cada quilowatt;
		b. o valor a ser pago por essa residência;
		c. o valor a ser pago com desconto de 15%.
		 */
		
		double salMinimo,quantQuilowatts, quilowatts,valorKw, desconto,soma, total;
		
		System.out.println("Digite o valor do salario minimo: ");
		salMinimo = scanner.nextDouble();
		
		System.out.println("Digite a quantidade de energia consumida: ");
		quantQuilowatts = scanner.nextDouble();
		
		quilowatts = (salMinimo*5)/100;
		valorKw = quilowatts*quantQuilowatts;
		desconto = (valorKw*15)/100;
		total = valorKw-desconto;
		
		System.out.println("O valor de cada quilowatts é: "+ quilowatts);
		System.out.println("O valor de quilowatts consumidos é: "+valorKw);
		System.out.println("O desconto é de: "+desconto);
		System.out.println("O valor a ser pago com desconto: "+total);

	}

}
