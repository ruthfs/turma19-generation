package entities;

public class Pos extends Estudante{

	private double pedirCreditoPos;
	
	public Pos(int matricula, String cpf, double pedirCreditoPos) {
		super(matricula, cpf);
		this.pedirCreditoPos = pedirCreditoPos;
	}

	public double getPedirCreditoPos() {
		return pedirCreditoPos;
	}

	public void setPedirCreditoPos(double pedirCreditoPos) {
		this.pedirCreditoPos = pedirCreditoPos;
	}

	
	
}
