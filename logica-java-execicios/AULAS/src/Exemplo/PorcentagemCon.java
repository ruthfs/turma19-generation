/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */


package Exemplo;

import java.util.Scanner;

public class PorcentagemCon {
	
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner (System.in);
		
				double custoFabrica, custoConsumidor = 0;
				double custoDistribuidor = 28.0, impostos = 45.0;
				double distribuidor, valorImpostos;
				
				System.out.println("Digite o valor do custo de f�brica: ");
				custoFabrica = leitor.nextInt();
				
				distribuidor = (custoFabrica * custoDistribuidor)/100;
				valorImpostos = (custoFabrica * impostos)/100 ;
				custoConsumidor = custoFabrica + (distribuidor + valorImpostos);
				
				System.out.print("O valor total de seu carro �: "+ custoConsumidor);
				
	}

}
