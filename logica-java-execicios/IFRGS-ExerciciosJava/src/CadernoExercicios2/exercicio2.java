package CadernoExercicios2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que leia um valor num�rico inteiro. O programa deve 
		apresentar a mensagem �O valor est� na faixa permitida�, caso o valor 
		informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa 
		deve apresentar a mensagem �O valor est� fora da faixa permitida
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num, resp;
		
		System.out.print("Digite um n�mero: ");
		num=scanner.nextInt();
		
		if(num==1 && num<=9) {
			System.out.println("O valor esta na faixa permitida [1-9]");
		}
		else {
			System.out.println("O valor est� FORA da faixa permitida [1-9]");
		}
		
	}

}
