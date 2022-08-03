package CadernoExercicios6;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que preencha três vetores com dez posições cada um: o
		 * primeiro vetor, com os nomes de dez produtos; o segundo vetor, com os códigos
		 * dos dez produtos; e o terceiro vetor, com os preços dos produtos. Mostre um
		 * relatório apenas com o nome, o código, o preço e o novo preço dos produtos
		 * que sofrerão aumento. Sabe-se que os produtos que sofrerão aumento são
		 * aqueles que possuem código par ou preço superior a R$ 1.000,00. Sabe-se ainda
		 * que, para os produtos que satisfizerem às duas condições anteriores, código e
		 * preço, o aumento será de 20%; para aqueles que satisfizerem apenas à condição
		 * do código, o aumento será de 15%; e para aqueles que satisfizerem apenas à
		 * condição de preço, o aumento será de 10%.
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int cont;
		String[] nomeProd = new String[10];
		int[] codProd = new int[10];
		double[] valorProd = new double[10];
		double aumento = 0, novoValor = 0;

		for (cont = 1; cont <= nomeProd.length; cont++) {
			System.out.print("Digite o produto: ");
			nomeProd[cont - 1] = scanner.next();
			System.out.print("Digite o código do produto [2 digitos]: ");
			codProd[cont - 1] = scanner.nextInt();
			System.out.print("Digite o valor do produto: ");
			valorProd[cont - 1] = scanner.nextDouble();
		}

		if (codProd[cont = 1] % 2 == 0 && valorProd[cont = 1] >= 1000) {
			aumento = (valorProd[cont - 1] * 20) / 100;
			novoValor = aumento + valorProd[cont - 1];
			System.out.printf("Produto: %s \nCódido: %d \nAumento: %.2f \nNovo Valor: R$ %.2f", nomeProd[cont - 1],
					codProd[cont - 1], aumento, novoValor);
		}

		if (codProd[cont = 1] % 2 == 0) {
			aumento = (valorProd[cont - 1] * 15) / 100;
			novoValor = aumento + valorProd[cont - 1];
			System.out.printf("Produto: %s \nCódido: %d \nAumento: %.2f \nNovo Valor: R$ %.2f", nomeProd[cont - 1],
					codProd[cont - 1], aumento, novoValor);
		}

		if (codProd[cont = 1] % 2 != 0 && valorProd[cont - 1] >= 1000) {
			aumento = (valorProd[cont - 1] * 10) / 100;
			novoValor = aumento + valorProd[cont - 1];
			System.out.printf("Produto: %s \nCódido: %d \nAumento: %.2f \nNovo Valor: R$ %.2f", nomeProd[cont - 1],
					codProd[cont - 1], aumento, novoValor);
		}
	}

}
