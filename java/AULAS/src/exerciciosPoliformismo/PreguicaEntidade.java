package exerciciosPoliformismo;

public class PreguicaEntidade extends Animal{

	private String preguica;

	public PreguicaEntidade(String nome, String som, String correr, int idade, String preguica) {
		super(nome, som, correr, idade);
		this.preguica = preguica;
	}

	public String getPreguica() {
		return preguica;
	}

	public void setPreguica(String preguica) {
		this.preguica = preguica;
	}
	
	
}
