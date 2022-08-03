/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final
 *  deste aluno. Considerar que a média é ponderada e que o peso das notas é: 
 *  2,3 e 5, respectivamente. */


package Exemplo;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String [] args) {

		Scanner leitor = new Scanner (System.in);
		
		double nota1, nota2 = 0.0, nota3 = 0.0, result;
		
		System.out.print("Qual o valor da primeira nota ? ");
		nota1 = leitor.nextDouble();
		System.out.print("Qual o valor da segunda nota ? ");
		nota1 = leitor.nextDouble();
		System.out.print("Qual o valor da terceira nota ? ");
		nota1 = leitor.nextDouble();
		
		result =(nota1/2)+(nota2/3)+(nota3/5);
		System.out.println("A sua média final é: "+ result);
		
		
		
		
	}
}
