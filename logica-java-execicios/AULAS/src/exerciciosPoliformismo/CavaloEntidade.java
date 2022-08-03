package exerciciosPoliformismo;

public class CavaloEntidade extends Animal {

	private String cavalo;

	public CavaloEntidade(String nome, String som, String correr, int idade, String cavalo) {
		super(nome, som, correr, idade);
		this.cavalo = cavalo;
	}

	public String getCavalo() {
		return cavalo;
	}

	public void setCavalo(String cavalo) {
		this.cavalo = cavalo;
	}
	
	
}
