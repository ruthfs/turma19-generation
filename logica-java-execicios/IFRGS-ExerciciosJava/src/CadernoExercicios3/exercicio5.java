package CadernoExercicios3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		/*
		Crie um programa para ler a quantidade de litros de combustível e a 
		distância percorrida por um carro em várias viagens. O programa deve 
		calcular o consumo médio do carro, que é igual a média de quilômetros 
		por litro de todas as viagens. O número de viagens realizado deve ser 
		informado pelo usuário
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int quantLitros, distKm, viagem, listaViagem, addDistancia, addLitros;
		double  media;
		
		System.out.println("Calculo de gasto de combustivel por kilometros.");
		
		System.out.print("Digite o numero de viagens: ");
		viagem=scanner.nextInt();
		addDistancia=0;
		addLitros=0;
		listaViagem=0;
		
		while(listaViagem<viagem) {
			System.out.printf ("Viagem %d | Distancia: ", listaViagem+1);
			distKm=scanner.nextInt();
			addDistancia=addDistancia+distKm;
			System.out.printf ("Viagem %d | Litros gastos: ", listaViagem+1);
			quantLitros=scanner.nextInt();
			addLitros=addLitros+quantLitros;
			listaViagem=listaViagem+1;
		}
		
		media=(double)addLitros/viagem;
		
		System.out.printf("A média de consumo das %d viagens, é de %.2f litros ",viagem, media);
	}

}
