package Exemplo;

import java.util.Scanner;

public class ProblemaVetor {

	public static void main(String[] args) {
		/*
		 * 4 pessoas, nome 4 pessoas, nota notas, numero inteiro, 1-10 exibir: nome -
		 * nota, nota: at� 5 "ainda n�o", acima de 5 "muito bem"
		 */

		Scanner leitor = new Scanner(System.in);

		String nomes[] = new String[4];
		int notas[] = new int[4];

		for (int x = 0; x < notas.length; x++) {
			System.out.printf("Informe o nome do aluno %d : ", x + 1);
			nomes[x] = leitor.next();
			System.out.println("Informe a nota: ");
			notas[x] = leitor.nextInt();

		}

		for (int x = 0; x < notas.length; x++) {

			if (notas[x] <=5) {
				System.out.printf("%s - nota %d - Ainda n�o!", nomes[x], notas[x]);
			} else {
				System.out.printf("\n%s - nota %d - Muito bem!\n", nomes[x], notas[x]);
			}
		}

	}
}
