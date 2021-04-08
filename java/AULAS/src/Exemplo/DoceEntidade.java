package Exemplo;

public class DoceEntidade extends ProdutoEntidade {

	// atributo
	private String fabricante;

	// construtor
	public DoceEntidade(String descricao, String codigo, double valorUnitario, String fabricante) {
		super(descricao, codigo, valorUnitario);
		this.fabricante = fabricante;
	}

	// encapsulamento
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
