package Exemplo;

public class FuncionarioTerEntidade extends FuncionarioEntidate {

	private double adicional;

	public FuncionarioTerEntidade(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public FuncionarioTerEntidade(String matricula, String nome, int hrsTrabalhadas, double valorHora,
			double adicional) {
		super(matricula, nome, hrsTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double totalSalario() {

		return (hrsTrabalhadas * valorHora)+adicional;
	}

}
