/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
 *  e calcule a seguinte expressão: 
 */

package Exemplo;

import java.util.Scanner;

public class SistemaAbc {
	
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double a, b, c;
		
		System.out.print("Digite o primeiro numero: ");
		a = leitor.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		b = leitor.nextDouble();
		
		System.out.print("Digite o terceiro numero: ");
		c = leitor.nextDouble();
		
		double r = Math.pow ((a + b), 2.0);
		double s = Math.pow ((b + c), 2.0);
		double d = (r + s / 2);
		
		System.out.print("O resltado da questão é: "+ d);
		
	}

}
