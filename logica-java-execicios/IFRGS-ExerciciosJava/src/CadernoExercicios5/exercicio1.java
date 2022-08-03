package CadernoExercicios5;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		/*
		Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os 
		dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas 
		informações para cada habitante, calcule e mostre:
		- a média dos salários do grupo;
		- a maior e a menor idade do grupo;
		- a quantidade de mulheres com salário até R$ 1500,00;
		- a idade e o sexo da pessoa que possui o menor salário.
		Finalize a entrada de dados ao ser digitada uma idade negativa.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		char genero='s',menorSleGenero='s';
		int idade=1, qtdHabitantes=0, qtdMulher=0, menorSlrIdade=999;
		double salario=0, mediaSlr=0,somaSlr=0, maiorIdade=0, menorIdade=0, menorSlr=0;
		
		System.out.println("Programa para calcular o percentural de uma cidade. \nPara sair Digite '0'");
		
		while(idade>0) {
			
			System.out.print("Digite a idade: \n");
			idade = scanner.nextInt();
			
			
			if(idade>0) {
				
				System.out.print("Digite o genero Masculino(M), Feminino(F): \n");
				genero = scanner.next().toUpperCase().charAt(0);
				
				System.out.print("Digite o salário: \n");
				salario=scanner.nextDouble();	
			}
				
			if (salario>0) {
				qtdHabitantes++;
				somaSlr=somaSlr+salario;
				mediaSlr=(somaSlr*qtdHabitantes)/100;
			}	
			
			if(idade<menorIdade) {
				menorIdade=idade;
			}
			if(idade>maiorIdade) {
				maiorIdade=idade;
			}
			
			if(genero=='F' && salario<=1500) {
				qtdMulher++;
			}
			
			if(salario<menorSlr) {
				menorSlr=salario;
				menorSlrIdade=idade;
				menorSleGenero=genero;
			}
		}
		
		System.out.printf("A média dos salários do grupo é R$ %.2f",mediaSlr);
		System.out.printf("A maior idade é %d e a menor idade é %d",maiorIdade,menorIdade);
		System.out.printf("a quantidade de mulheres com salário até R$ 1500,00 é %d",qtdMulher);
		System.out.printf("A idade e o sexo da pessoa que possui o menor salário é de %d anos, o genero é %c e o salario R$ %.2f .",menorSlrIdade,menorSleGenero,menorSlr);
		
	}

}
