package CadernoExercicios1;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
		
	/*
	O custo ao consumidor de um carro novo é a soma do preço de fábrica 
	com o percentual de lucro do distribuidor e dos impostos aplicados ao 
	preço de fábrica. Faça um programa que receba o preço de fábrica de 
	um veículo, o percentual de lucro do distribuidor e o percentual de 
	impostos, calcule e mostre:
	a. o valor correspondente ao lucro do distribuidor;
	b. o valor correspondente aos impostos;
	c. o preço final do produto
	 */
		
	double precoFabrica,perDistribuidor,perImposto, total, totalDistribuidor, totalImpostos;
	
	System.out.println("Digite o preço de fábrica do carro: ");
	precoFabrica = scanner.nextDouble();
	
	System.out.println("Digite o percentual do distribuidor (%): ");
	perDistribuidor = scanner.nextDouble();
	
	System.out.println("Digite o percentual de impostos: ");
	perImposto = scanner.nextDouble();
	
	totalDistribuidor=precoFabrica*(perDistribuidor/100);
	
	totalImpostos=precoFabrica*(perImposto/100);
	
	total = precoFabrica+totalDistribuidor+totalImpostos;
	
	System.out.println("O lucro do distribuidor é: R$ "+	totalDistribuidor);
	System.out.println("O valor dos impostos é: R$ "+	totalImpostos);
	System.out.println("O valor total  do veículo é: R$ "+	total);
		
	}
}