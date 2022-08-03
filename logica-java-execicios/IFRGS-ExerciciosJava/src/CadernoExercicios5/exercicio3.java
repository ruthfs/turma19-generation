package CadernoExercicios5;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		/*
		 A empresa JS Recrutamento e Sele��o Ltda. faz recrutamento e sele��o de 
		funcion�rios para v�rias empresas em diversos ramos de atua��o. Para facilitar 
		o trabalho de identifica��o do perfil dos candidatos que se inscrevem para as 
		vagas, resolveu fazer um programa para registrar alguns dados para obter as 
		informa��es a seguir:
		a. n�mero de candidatos do sexo feminino;
		b. n�mero de candidatos do sexo masculino;
		c. idade m�dia dos homens;
		d. idade m�dia das mulheres com experi�ncia
		Fa�a um programa para calcular as informa��es solicitadas anteriormente, 
		sabendo que para cada candidato devem ser informados sexo (M ou F), idade e 
		tempo de experi�ncia profissional (em anos). Tamb�m considere que a cada 
		itera��o dever� ser perguntado ao usu�rio se deseja cadastrar outro candidato 
		ou n�o. Quando a resposta for negativa, os resultados dever�o ser
		apresentados.
		 */

		Scanner scanner = new Scanner(System.in);
		
		char genero='S', opcao='S';
		int idade=0, idadeHomens=0,idadeMulheres=0, tempExp=0, contMlhr=0, contHm=0, contPrt=0;
		double mediaHomens=0,mediaMulheres=0;
		
		while (opcao!='N') {
			
			System.out.print("Deseja cadastrar outro candidatO ? Sim (S) N�o (N)\n");
			opcao=scanner.next().toUpperCase().charAt(0);
			
			if(opcao!='N') {

				System.out.print("Digite o genero - Masculino(M), Feminino(F): \n");
				genero=scanner.next().toUpperCase().charAt(0);
				contPrt=contPrt+1;
						
				System.out.print("Digite a idade: \n");
				idade=scanner.nextInt();
				
				System.out.print("Digite o tempo de experi�ncia em anos: \n");
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
		
		System.out.printf("N�mero de candidatos do sexo feminino: %d \n",contMlhr);
		System.out.printf("N�mero de candidatos do sexo masculino: %d \n",contHm);
		System.out.printf("Idade m�dia dos homens: %.2f \n",mediaHomens);
		System.out.printf("Idade m�dia das mulheres com experi�ncia: %.2f \n",mediaMulheres);
	}

}
