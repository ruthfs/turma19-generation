package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Conta1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Conta contajoao = new Conta();

		System.out.println("Digite o numero da conta: ");
		contajoao.numero = leia.nextInt();
		System.out.println("Digite o cpf: ");
		contajoao.cpf = leia.next();
		System.out.println("Digite o valor: ");
		double valor =leia.nextDouble();
		System.out.println("Operação de 1-crédito ou 2-débito ?");
		char opcao = leia.next().charAt(0);
		
		if(opcao==1) {
			contajoao.credito(valor);
		}

		System.out.printf("CPF : %s \n", contajoao.cpf);
		System.out.printf("Numero da conta: %d \n ", contajoao.numero);
		System.out.printf("Saldo: %.2f \n", contajoao.saldo);

		
	}

}
