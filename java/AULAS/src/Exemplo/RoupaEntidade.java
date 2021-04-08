package Exemplo;

public class RoupaEntidade extends ProdutoEntidade {

	// atributos
	private String marca;

	// contrutores
	public RoupaEntidade(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
	}

	// encapsulamento
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// metodos - não necessáario
}
