package lista4Objeto;

import java.util.Scanner;

import lista4Classes.Aviao;

public class TesteAviao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Aviao aviao1 = new Aviao();

		System.out.print("Digite a marca do avião: ");
		aviao1.marca = leia.next();
		System.out.print("Digite a CIA aerea: ");
		aviao1.ciaAerea = leia.next();
		System.out.print("Digite o tipo de aeronave: ");
		aviao1.tipo = leia.next();
		System.out.print("Digite o tipo de voo é 1-Nacional ou 2-Internacional: ");
		aviao1.nacionalInter = leia.next().charAt(0);

		System.out.printf("Informações sobre a aeronave:\n%s \n%s \n%s \n%s ", aviao1.marca, aviao1.ciaAerea,
				aviao1.tipo, aviao1.tipoVoo());
	}
}
