package CadernoExercicios3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		/*
		Crie um programa para ler a quantidade de litros de combust�vel e a 
		dist�ncia percorrida por um carro em v�rias viagens. O programa deve 
		calcular o consumo m�dio do carro, que � igual a m�dia de quil�metros 
		por litro de todas as viagens. O n�mero de viagens realizado deve ser 
		informado pelo usu�rio
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
		
		System.out.printf("A m�dia de consumo das %d viagens, � de %.2f litros ",viagem, media);
	}

}
