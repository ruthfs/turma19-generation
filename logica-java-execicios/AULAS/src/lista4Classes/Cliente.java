package lista4Classes;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public String cpf;
	
	//método
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
}
