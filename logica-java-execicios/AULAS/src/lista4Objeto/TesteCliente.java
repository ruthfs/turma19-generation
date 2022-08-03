package lista4Objeto;

import java.util.Scanner;

import lista4Classes.Cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		System.out.print("Digite o nome do cliente 1: ");
		cliente1.nome = leia.next();
		System.out.print("Digite o ano de nascimento do cliente 1: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.print("Qual seu cpf? ");
		cliente1.cpf = leia.next();

		System.out.print("Digite o nome do cliente 2: ");
		cliente2.nome = leia.next();
		System.out.print("Digite o ano de nascimento do cliente 2: ");
		cliente2.anoNascimento = leia.nextInt();
		System.out.print("Qual seu cpf? ");
		cliente2.cpf = leia.next();

		System.out.printf("Cliente 1 se chama %s tem %d anos e CPF: %s", cliente1.nome, cliente1.calculaIdade(2021),
				cliente1.cpf);
		System.out.printf("\nCliente 2 se chama %s tem %d anos e CPF: %s", cliente2.nome, cliente2.calculaIdade(2021),
				cliente2.cpf);

	}

}
