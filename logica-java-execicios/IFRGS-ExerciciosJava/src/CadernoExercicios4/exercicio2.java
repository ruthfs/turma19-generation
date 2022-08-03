package CadernoExercicios4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		/*
		O Detran deseja realizar uma vistoria geral nos veículos do estado. Para 
		isso, elaborou a seguinte distribuição, a partir do último dígito do número na 
		placa do automóvel:
		 */
			
		Scanner scanner = new Scanner(System.in);
		
		int numPlaca, placa;
		
		System.out.print("Digite os 4 digitos da placa: ");
		numPlaca=scanner.nextInt();
		
		placa = numPlaca%10;
		
		switch(placa) {
		case 0: System.out.println("Vistoria marcada para Janeiro");break;
		case 1: System.out.println("Vistoria marcada para Fevereiro");break;
		case 2: System.out.println("Vistoria marcada para Março");break;
		case 3: System.out.println("Vistoria marcada para Abril");break;
		case 4: System.out.println("Vistoria marcada para Maio");break;
		case 5: System.out.println("Vistoria marcada para Junho");break;
		case 6: System.out.println("Vistoria marcada para Setembro");break;
		case 7: System.out.println("Vistoria marcada para Outubro");break;
		case 8: System.out.println("Vistoria marcada para Novembro");break;
		case 9: System.out.println("Vistoria marcada para Dezembro");break;
		default: System.out.println("Número Inválido");
		}
	}

}
