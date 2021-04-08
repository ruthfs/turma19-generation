package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Basico;
import entities.Medio;

public class CadEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char opcao;
		do {
			System.out.println("Escolaaa Gen");
			System.out.println("Ou vai ou vai!!");
			System.out.println();
			System.out.println("basico-1 médio-2 graduação-3 pós-4 mestrado-5 sair-6");
			System.out.println("Dgite  a opcão: ");
			opcao = leia.next().charAt(0);

			if (opcao == '1') {

				System.out.print("Digite a matricula do aluno: ");
				int matricula = leia.nextInt();
				System.out.print("Digite o CPF do aluno: ");
				String cpf = leia.next();
				System.out.print("Digite o dia de amiversário do aluno: ");
				int diaAniversario = leia.nextInt();

				Basico aluno = new Basico(matricula, cpf, diaAniversario);

				System.out.print("Digite a nota: ");
				double nota = leia.nextDouble();
				aluno.incluirPontos(nota);

				if (aluno.getPontos() <= 5) {
					System.out.println("Ainda não!");
				} else {
					System.out.println("Parabéns!!");
				}
				System.out.print("Digite o dia de hoje: ");
				int diaAtual = leia.nextInt();
				aluno.bonusAniversario(diaAtual);
				System.out.println("Pontos atuais: " + aluno.getPontos());
				System.out.print("Continua ? 1-sim 2 não");
				opcao = leia.next().charAt(0);
			} else if (opcao == '2') {
				System.out.print("Digite a matricula do aluno: ");
				int matricula = leia.nextInt();
				System.out.print("Digite o CPF do aluno: ");
				String cpf = leia.next();
				System.out.println("Deseja tirar boletim ? ");
				
					
				System.out.print("Continua ? 1-sim 2 não");
				opcao = leia.next().charAt(0);
			}

		} while (opcao != '6');

		System.out.println("Fim do Programa!");
	}
}
