package lista4Classes;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public String cpf;
	
	//m�todo
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
}
