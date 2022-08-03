package CadernoExercicios5;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser
		 * comercializada na bolsa de valores, o preço de compra e o preço de venda de
		 * cada ação e que calcule e mostre:  a quantidade de ações com lucro superior
		 * a R$ 1.000,00;  a quantidade de ações com lucro inferior a R$ 200,00.
		 * Finalize com o tipo de ação ‘F’.
		 */

		Scanner scanner = new Scanner(System.in);

		char letra='S';
		int cont1000 = 0, cont200 = 0;
		double precoCompra=0, precoVenda=0, lucro=0;

		while (letra != 'F') {
			
			System.out.println("Calcula o Preço das Ações!");

			System.out.print("Digite uma letra a ser comercializada: ");
			letra = scanner.next().toUpperCase().charAt(0);
			
			if(letra!='F'){
				System.out.print("Digite o valor da compra: ");
				precoCompra = scanner.nextDouble();

				System.out.print("Digite o valor da venda: ");
				precoVenda = scanner.nextDouble();
			}

			lucro = precoVenda - precoCompra;

			if (lucro > 1000) {
				cont1000 = cont1000 + 1;
			}

			if (lucro < 200) {
				cont200 = cont200 + 1;
			}
			
		}

		System.out.printf("Quantidade de ações com lucro superior a R$ 1.000,00: %d \n", cont1000);
		System.out.printf("a quantidade de ações com lucro inferior a R$ 200,00: %d \n", cont200);
	}

}
