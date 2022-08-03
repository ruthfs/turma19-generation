package Exemplo;

public class FuncionarioEntidate {
	
	private String matricula;
	private String nome;
	protected int hrsTrabalhadas;
	protected double valorHora;
	
	public FuncionarioEntidate(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public FuncionarioEntidate(String matricula, String nome, int hrsTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.hrsTrabalhadas = hrsTrabalhadas;
		this.valorHora = valorHora;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHrsTrabalhadas() {
		return hrsTrabalhadas;
	}

	public void setHrsTrabalhadas(int hrsTrabalhadas) {
		this.hrsTrabalhadas = hrsTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double totalSalario () {
		
		return this.hrsTrabalhadas*valorHora;
	}
	
	// salario = hrsTrabalhadas*valorHora
	// overwrite - salario=hrsTrabalhadas*valorHora+adicional

	
}
