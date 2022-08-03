package CadernoExercicios5;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		/*
		 A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de 
		funcionários para várias empresas em diversos ramos de atuação. Para facilitar 
		o trabalho de identificação do perfil dos candidatos que se inscrevem para as 
		vagas, resolveu fazer um programa para registrar alguns dados para obter as 
		informações a seguir:
		a. número de candidatos do sexo feminino;
		b. número de candidatos do sexo masculino;
		c. idade média dos homens;
		d. idade média das mulheres com experiência
		Faça um programa para calcular as informações solicitadas anteriormente, 
		sabendo que para cada candidato devem ser informados sexo (M ou F), idade e 
		tempo de experiência profissional (em anos). Também considere que a cada 
		iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato 
		ou não. Quando a resposta for negativa, os resultados deverão ser
		apresentados.
		 */

		Scanner scanner = new Scanner(System.in);
		
		char genero='S', opcao='S';
		int idade=0, idadeHomens=0,idadeMulheres=0, tempExp=0, contMlhr=0, contHm=0, contPrt=0;
		double mediaHomens=0,mediaMulheres=0;
		
		while (opcao!='N') {
			
			System.out.print("Deseja cadastrar outro candidatO ? Sim (S) Não (N)\n");
			opcao=scanner.next().toUpperCase().charAt(0);
			
			if(opcao!='N') {

				System.out.print("Digite o genero - Masculino(M), Feminino(F): \n");
				genero=scanner.next().toUpperCase().charAt(0);
				contPrt=contPrt+1;
						
				System.out.print("Digite a idade: \n");
				idade=scanner.nextInt();
				
				System.out.print("Digite o tempo de experiência em anos: \n");
				tempExp=scanner.nextInt();
			
			}
			
			if(genero=='M') {
				contHm++;
				idadeHomens=idadeHomens+idade;
				mediaHomens=(idadeHomens*contPrt)/100;
			}
			
			if(genero=='F') {
				contMlhr++;
			}
			if(genero=='F' && tempExp!=0) {
				idadeMulheres=idadeMulheres+idade;
				mediaMulheres=(idadeMulheres*contPrt)/100;
			} 
			
		}
		
		System.out.printf("Número de candidatos do sexo feminino: %d \n",contMlhr);
		System.out.printf("Número de candidatos do sexo masculino: %d \n",contHm);
		System.out.printf("Idade média dos homens: %.2f \n",mediaHomens);
		System.out.printf("Idade média das mulheres com experiência: %.2f \n",mediaMulheres);
	}

}
