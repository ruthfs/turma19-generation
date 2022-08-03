package CadernoExercicios4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		/*
		Crie um programa para ler a quantidade de litros de combustível e a 
		distância percorrida por um carro em várias viagens. O programa deve 
		calcular o consumo médio do carro, que é igual a média de quilômetros 
		por litro de todas as viagens. O número de viagens realizado deve ser 
		informado pelo usuário
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int qtdLitros, distancia, viagem, addLitros, addDistancia;
		double mediaKm, mediaLt;
		
		System.out.print("Digite a quantidade de viagens: ");
		viagem = scanner.nextInt();
		
		addLitros=0;
		addDistancia=0;
		
		for(int lista=0; lista<viagem;lista++) {
			System.out.printf("Viagem %d | Distânca em Km: ", lista+1);
			distancia=scanner.nextInt();
			addDistancia=addDistancia+distancia;
			System.out.printf("Viagem %d | Litros: ", lista+1);
			qtdLitros=scanner.nextInt();
			addLitros=addLitros+qtdLitros;
		}
		
		mediaKm=addDistancia/viagem;
		mediaLt=addLitros/viagem;
		
		System.out.printf("A média de distancia percorrida das %d viagens, é de %.2f quilometros. \n", viagem, mediaKm);
		System.out.printf("A média de litros gastos das %d viagens, é de %.2f litros. \n", viagem, mediaLt);
		
	}

}
