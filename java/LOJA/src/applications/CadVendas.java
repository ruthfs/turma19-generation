package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Bolsa;
import entities.Loja;
import entities.Produto;

public class CadVendas {

	static Loja loja1 = new Loja("GERA��O DE BOLSAS", "12345678911/0001");
	static List<Bolsa> estoque = new ArrayList<>();
	static List<Bolsa> historico = new ArrayList<>();

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		char opcao1 = 0;
		char opcao2 = 0;
		int achou = 0;
		double totalPagamento = 0.0;

		// Itens do Estoque******************************
		estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "BOLSA DE AL�A", "BA144", 150.0, 3, "GUCCI"));
		estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "MOCHILA DE ESPORTE", "ME342", 50.0, 4, "NIKE"));
		estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "ESCOLAR", "E0342", 30.0, 2, "ADIDAS"));
		estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "ACAMPAMENTO", "A0978", 200.0, 1, "OAKLEY"));
		estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "LUXO", "F0761", 100.0, 0, "LOUIS VUITTON"));
		// **********************************************

		System.out.printf("LOJA %s \n", loja1.getNome());
		System.out.println("\n**LISTA DE PRODUTOS**\n");
		MostrarEstoque();

		do {
			System.out.println("Digite o c�digo do que ira comprar: ");
			String codigo = leia.next();
			for (Bolsa prod : estoque) {

				// Verificando escolha *********
				for (Bolsa item : historico) {
					if (codigo.equals(item.getCodigo())) {
						achou++;
					}
				}
				// Verificando escolha *********

				if (achou > 0) {
					System.out.println("Produto j� foi comprado");
					break;
				} else if (codigo.equals(prod.getCodigo())) {
					System.out.println("Produto Escolhido: \nDescri��o - " + prod.getDescricao() + "\nC�digo: "
							+ prod.getCodigo());
					System.out.println("Quantidade em estoque: " + prod.getQtdeEstoque() + " unidades");
					System.out.println("Quantos deseja comprar: ");
					int quant = leia.nextInt();

					System.out.println("Digite 1-Confirmar ou 2-Cancelar: ");
					opcao1 = leia.next().charAt(0);

					if (opcao1 == '1') {
						prod.tirarEstoque(quant);
						if ((prod.getQtdeEstoque() - quant) >= 0)
							historico.add(prod);
						break;
					}
				}
			}

			System.out.println("Deseja encerrar a compra ? 1-Sim ou 2-N�o");
			opcao2 = leia.next().charAt(0);

			if (opcao2 == '2') {
				System.out.println("**PRODUTOS DISPONIVEIS**");
				MostrarEstoque();
			}
		} while (opcao2 != '1');

		for (Bolsa item : historico) {
			totalPagamento += item.getValorUnitario() * item.getQtdeEstoque();
		}

		System.out.println("Valor Total a ser pago: R$ " + totalPagamento);
		System.out.println("Forma de pagamento 1-� vista / 2-D�bito / 3-Cr�dito: ");
		char tipoPagamento = leia.next().charAt(0);

		if (tipoPagamento == '1') {
			MostrarHistorico();
			totalPagamento = totalPagamento - (totalPagamento * 0.10);
			System.out.println("\nPAGAMENTO � VISTA NO DINHEIRO: ");
			System.out.println("\nValor a ser pago: R$ " + totalPagamento + " (Com 10% desconto)");
		} else if (tipoPagamento == '2') {
			MostrarHistorico();
			System.out.println("\nPAGAMENTO NO D�BITO: ");
			System.out.println("\nValor a ser pago: R$ " + totalPagamento + " (Sem desconto)");
		} else if (tipoPagamento == '3') {
			System.out.println("Digite 1-Parcelar 1x ou 2-Parcelar 2x:  ");
			char parcelas = leia.next().charAt(0);

			if (parcelas == '1') {
				MostrarHistorico();
				totalPagamento = totalPagamento * 1.10;
				System.out.println("\nPAGAMENTO PARCELADO: ");
				System.out.println("\nValor a do produto: 1 parcela de R$ " + totalPagamento + " (Com 10% Juros)");
			} else {
				MostrarHistorico();
				totalPagamento = (totalPagamento * 1.20) / 2;
				System.out.println("\nPAGAMENTO PARCELADO: ");
				System.out.println("Valor a ser pago ser� 2 parcelas de R$ " + totalPagamento + " (Com 20% Juros)");
			}
		}
	}

	public static void MostrarEstoque() {
		for (Bolsa prod : estoque) {

			if (prod.getQtdeEstoque() > 0)
				System.out.println("Quantidade: " + prod.getQtdeEstoque());
			else
				System.out.println("Quantidade: ESGOTADO!!");

			System.out.println(" Marca: " + prod.getMarca());
			System.out.println(" Descri��o: " + prod.getDescricao());
			System.out.printf(" Valor Imposto: R$ %.2f \n", prod.getValorUnitario() * 0.09);
			System.out.println(" Valor: R$ " + prod.getValorUnitario());
			System.out.println(" C�digo: " + prod.getCodigo());
			System.out.println();
		}
	}

	public static void MostrarHistorico() {

		System.out.println("\n***NOTA FISCAL*****\n");
		System.out.println("Nome da Loja: " + loja1.getNome());
		System.out.println("CNPJ: " + loja1.getCnpj());
		System.out.println();

		for (Bolsa prod : historico) {

			System.out.println("Quantidade: " + prod.getQtdeEstoque());
			System.out.println(" Marca: " + prod.getMarca());
			System.out.println(" Descri��o: " + prod.getDescricao());
			System.out.printf(" Valor Imposto: R$ %.2f \n", prod.getValorUnitario() * 0.09);
			System.out.println(" Valor: R$ " + prod.getValorUnitario());
			System.out.println(" C�digo: " + prod.getCodigo());
			System.out.println();
		}

	}
}
