package CadernoExercicios2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		/*
		Uma empresa decide dar um aumento de 30% aos funcion�rios cujo 
		sal�rio � inferior a 5000. Escreva um programa que possa ser utilizado 
		para efetuar o c�lculo do sal�rio reajustado de um funcion�rio, a partir 
		do valor do sal�rio informado pelo usu�rio.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double salUsuario,reajuste, salFinal;
		
		System.out.println("Digite o valor da salario: ");
		salUsuario = scanner.nextDouble();
		
		if(salUsuario >=5000) {
			System.out.println("Calculo apenas para sal�rios abaixo de R$ 5.000");
		}
		
		if(salUsuario<5000) {
			reajuste=(salUsuario*30)/100;
			salFinal = salUsuario+reajuste;
			System.out.printf("O salario ter� um reajuste 30%: R$ %.2f \n",reajuste);
			System.out.printf( "O novo sal�rio � de: R$ %.2f ",salFinal);
		}

	}

}
