package entities;

public class Medio extends Estudante{

	private int contadorBoletim;

	public Medio(int matricula, String cpf) {
		super(matricula, cpf);
	//	this.contadorBoletim = contadorBoletim;
	}

	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	public void imprimirBoletim() {
		System.out.println("IMPRIMIR: ");
		System.out.println("Pontos atuais: "+super.getPontos());
	}

}
