package lista4Classes;

public class Aviao {

	// atributos
	public String marca;
	public String tipo;
	public String ciaAerea;
	public char nacionalInter;
	

	// metodos
	public String tipoVoo() {
		String recebeVoo = " ";

		if (nacionalInter == '1') {
			recebeVoo = "Voo Nacional";
		} else if (nacionalInter == '2') {
			recebeVoo = "Voo Internacional";
		}
		return recebeVoo;
	}

}
