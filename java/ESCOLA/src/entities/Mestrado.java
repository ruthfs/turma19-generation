package entities;

public class Mestrado extends Estudante {

	private double usarCredMes;

	public Mestrado(int matricula, String cpf, double usarCredMes) {
		super(matricula, cpf);
		this.usarCredMes = usarCredMes;
	}

	public double getUsarCredMes() {
		return usarCredMes;
	}

	public void setUsarCredMes(double usarCredMes) {
		this.usarCredMes = usarCredMes;
	}
	
}
