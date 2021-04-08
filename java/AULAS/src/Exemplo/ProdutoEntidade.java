package Exemplo;

public class ProdutoEntidade {

	// atributos
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdEstoque;

	// construtores
	public ProdutoEntidade(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;

		// encapsulamento - getter and setter
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	/*
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	// metodos
	public void incluirEstoque(int valorSerIncluindo) {
		// this.qtdEstoque = qtdEstoque + valorIncluindo;
		this.qtdEstoque += valorSerIncluindo;
	}

	public void tirarEstoque(int valorSerExcluido) {
		if (this.qtdEstoque >= valorSerExcluido) {
			this.qtdEstoque = qtdEstoque - valorSerExcluido;
		} else {
			System.out.println("Estoque Indisponível.");
		}

	}

}
