package Exemplo;

public class RevistaEntidade extends ProdutoEntidade {
	
	private String editora;

	public RevistaEntidade(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
