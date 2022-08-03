package Extras;

import java.util.Random;

public class exercicio1 {

	public static void main(String[] args) {

		/*
		 * Gere e imprima uma matriz M 4x4, com valores aleatórios entre 0-9, após isso
		 * determine qual o maior número da matriz, com sua linha e coluna.
		 */

		Random numRandom = new Random();

		int i, j, linha = 0, col = 0, maior = 0;
		int[][] numAleatorios = new int[4][4];

		for (i = 0; i < numAleatorios.length; i++) {
			for (j = 0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = numRandom.nextInt(10);
				System.out.print(numAleatorios[i][j] + "-");
				if (numAleatorios[i][j] > maior) {
					maior = numAleatorios[i][j];
					linha = i;
					col = j;
				}
			}

			System.out.println();
		}

		System.out.printf("Maior Número: %d \nLinha %d \nColuna %d\n", maior, linha, col);
	}

}
