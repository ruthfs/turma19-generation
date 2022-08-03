package Exercicio_de_Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE) o número de pessoas calmas; o número
		 * de mulheres nervosas; o número de homens agressivos; o número de outros
		 * calmos; o número de pessoas nervosas com mais de 40 anos; o número de pessoas
		 * calmas com menos de 18 anos.
		 */

		Scanner leitor = new Scanner(System.in);

		final int LIMITE = 5;
		int idade = 0, contador = 0;
		char sexo = 0; // 1-feminino / 2-masculino / 3-Outros
		char opcao = 0; // (1-calma; 2-nervosa e 3- agressiva)
		int pcalmas = 0, mNervosa = 0, hAgressivo = 0, oCalmos = 0, pNervosa40 = 0, pCalmaMenos18 = 0;

		System.out.println("Você deseja fazer a pesquisa ? ");
		char continua = leitor.next().toUpperCase().charAt(0);

		while (continua == 'S' && contador < LIMITE) {
			System.out.print("Informe sua idade: ");
			idade = leitor.nextInt();
			System.out.print("Digite 1-Feminino / 2-Masculino / 3-Outros: ");
			sexo = leitor.next().charAt(0);
			System.out.print("Digite: \n 1-Calma:\n 2-Nervosa: \n3- Agressiva:");
			opcao = leitor.next().charAt(0);

			if (contador != LIMITE) {
				System.out.print("Deseja continuar ? ");
				continua = leitor.next().toUpperCase().charAt(0);
			}
			contador++;
		}
		if (opcao == '1') {
			pcalmas++;
		}
		if (sexo == '1' && opcao == '2') {
			mNervosa++;
		}
		if (sexo == '2' && opcao == '3') {
			hAgressivo++;
		}
		if (sexo == '3' && opcao == '1') {
			oCalmos++;
		}
		if (opcao == '2' && idade >= 40) {
			pNervosa40++;
		}
		if (opcao == '1' && idade < 18) {
			pCalmaMenos18++;
		}
		System.out.println("Pessoas Calmas: " + pcalmas);
		System.out.println("Mulheres Nervosas: " + mNervosa);
		System.out.println("Homens Agresivos: " + hAgressivo);
		System.out.println("Outros Calmos: " + oCalmos);
		System.out.println("Pessoas Nervosas acima de 40 anos: " + pNervosa40);
		System.out.println("Pessoas Calmas abaixo de 18 anos: " + pCalmaMenos18);
	}

}
