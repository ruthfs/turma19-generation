package exerciciosPoliformismo;

public class Animal {

	private String nome;
	private String som;
	private String correr;
	private int idade;
	public Animal(String nome, String som, String correr, int idade) {
		super();
		this.nome = nome;
		this.som = som;
		this.correr = correr;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
