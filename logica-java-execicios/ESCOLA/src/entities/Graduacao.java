package entities;

public class Graduacao extends Estudante {

	private double usarBonus;

	public Graduacao(int matricula, String cpf, double usarBonus) {
		super(matricula, cpf);
		this.usarBonus = usarBonus;
	}

	public double getUsarBonus() {
		return usarBonus;
	}

	public void setUsarBonus(double usarBonus) {
		this.usarBonus = usarBonus;
	}
	
	
}
