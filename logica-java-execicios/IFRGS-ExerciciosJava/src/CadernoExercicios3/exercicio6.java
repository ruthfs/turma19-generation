package CadernoExercicios3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		/*
		Para cada uma das mercadorias com que um armazém trabalha dispõese dos seguintes dados:
		− o nome da mercadoria;
		− o seu preço unitário;
		− a quantidade total vendida no mês.
		Elabore um programa para calcular o faturamento total mensal do armazém. O 
		faturamento total do armazém será calculado somando-se o total faturado por 
		cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu 
		preço unitário. O número de mercadorias comercializadas pelo armazém deve 
		ser informado pelo usuário.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int quntMercadoria, quantVendidaMerc, listaMercadoria;
		double preco, totalFaturMercadoria,totalMensal, addPreco, addQtdVendida;
		
		System.out.print("Digite a quantidade de mercadorias comercializadas: ");
		quntMercadoria=scanner.nextInt();
		
		addPreco=0;
		addQtdVendida=0;
		listaMercadoria=0;
		
		while(listaMercadoria<quntMercadoria) {
			System.out.printf("Mercadoria %d | Preço: ",listaMercadoria+1);
			preco=scanner.nextInt();
			addPreco=addPreco+preco;
			System.out.printf("Mercadoria %d | Quantidade Vendida: ",listaMercadoria+1);
			quantVendidaMerc=scanner.nextInt();
			addQtdVendida=addQtdVendida+quantVendidaMerc;
			listaMercadoria=listaMercadoria+1;
		}
		
		totalMensal=addQtdVendida*addPreco;
		System.out.printf("O valor total de mercadorias vendidas é de R$ %.2f",totalMensal);
	}

}
