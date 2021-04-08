package exerciciosPoliformismo;

public class CachorroEntidade extends Animal {

	private String cachorro;

	public CachorroEntidade(String nome, String som, String correr, int idade, String cachorro) {
		super(nome, som, correr, idade);
		this.cachorro = cachorro;
	}

	public String getCachorro() {
		return cachorro;
	}

	public void setCachorro(String cachorro) {
		this.cachorro = cachorro;
	}
	
	
}
