package Exemplo;

import java.util.Locale;

public class FuncionarioAPP {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		FuncionarioEntidate func1 = new FuncionarioEntidate("X1X1", "Maria", 40, 14.25); // instanciar
		FuncionarioTerEntidade terc1 = new FuncionarioTerEntidade("TT3-1", "José", 5.25);

		terc1.setHrsTrabalhadas(25);
		terc1.setValorHora(10);

		System.out.println(func1.getNome() + " salario: R$ " + func1.totalSalario());
		System.out.println(terc1.getNome() + " salario: R$ " + terc1.totalSalario());

	}

}
