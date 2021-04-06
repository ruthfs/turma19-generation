package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Prefeitura {

	public static void main(String[] args) {
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 * coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja
		 * saber: a) m�dia do sal�rio da popula��o; b) m�dia do n�mero de filhos; c)
		 * maior sal�rio; d) percentual de pessoas com sal�rio at� R$100,00.
		 */
		// inicio
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		final double HABITANTES = 4; // final � usado para constantes, com caixa alta
		double salario = 0.0, mediaSalario = 0.0, totalSalario = 0.0, mediaFilhos = 0.0, totalFilhos = 0.0;
		double maiorSalario = 0.0, filhos = 0, prctPessoas100 = 0.0, contPessoas100 = 0;

		for (int x = 1; x <= HABITANTES; x++) {
			System.out.printf("Informe o sal�rio do habitante %d: R$ ", x);
			salario = leitor.nextDouble();
			System.out.print("Informe a quantidade de filhos: ");
			filhos = leitor.nextDouble();
			System.out.println();

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario <= 100) {
				contPessoas100++;
			}

			totalSalario = totalSalario + salario;
			totalFilhos = totalFilhos + filhos;
		}
		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		prctPessoas100 = (contPessoas100 * 100) / HABITANTES;

		System.out.print("Total de filhos: "+totalFilhos);
		System.out.printf("\nM�dia de filhos � %.2f: ", mediaFilhos);
		System.out.printf("\nTotal de sal�rios: R$ %.2f", totalSalario);
		System.out.printf("\nM�dia de sal�rios: R$ %.2f", mediaSalario);
		System.out.printf("\nMaior salario: R$ %.2f", maiorSalario);
		System.out.printf("\nPercentual de pessoas que recebem at� 100 reais %.2f: %%", prctPessoas100);

	}

}
