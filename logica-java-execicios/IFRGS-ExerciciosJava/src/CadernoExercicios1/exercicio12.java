package CadernoExercicios1;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
		
	/*
	O custo ao consumidor de um carro novo � a soma do pre�o de f�brica 
	com o percentual de lucro do distribuidor e dos impostos aplicados ao 
	pre�o de f�brica. Fa�a um programa que receba o pre�o de f�brica de 
	um ve�culo, o percentual de lucro do distribuidor e o percentual de 
	impostos, calcule e mostre:
	a. o valor correspondente ao lucro do distribuidor;
	b. o valor correspondente aos impostos;
	c. o pre�o final do produto
	 */
		
	double precoFabrica,perDistribuidor,perImposto, total, totalDistribuidor, totalImpostos;
	
	System.out.println("Digite o pre�o de f�brica do carro: ");
	precoFabrica = scanner.nextDouble();
	
	System.out.println("Digite o percentual do distribuidor (%): ");
	perDistribuidor = scanner.nextDouble();
	
	System.out.println("Digite o percentual de impostos: ");
	perImposto = scanner.nextDouble();
	
	totalDistribuidor=precoFabrica*(perDistribuidor/100);
	
	totalImpostos=precoFabrica*(perImposto/100);
	
	total = precoFabrica+totalDistribuidor+totalImpostos;
	
	System.out.println("O lucro do distribuidor �: R$ "+	totalDistribuidor);
	System.out.println("O valor dos impostos �: R$ "+	totalImpostos);
	System.out.println("O valor total  do ve�culo �: R$ "+	total);
		
	}
}