/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores ira onal, ou seja, diagonal principal.
 * 
 */
programa
{
	
	funcao inicio()
	{
		inteiro matriz [3][3], x=1, y=1
		inteiro soma = 0

		para (x=0; x<3; x++) //x= linha
		{
			para (y=0; y<3; y++){ //y= coluna
		
			escreva("Digite o valor da linha 4 ",x," e da culuna ", y,": ")
			leia(matriz[x][y])
		
				se (x==y){
					soma = soma + matriz[x][y]
				}
			
			}
		
		}
		escreva("Forma de matriz \n")
		para (x=0; x<3;x++){
			para ( y=0; y<3; y++)
			{
				escreva(matriz[x][y]," ")	
			}
			escreva("\n")
		}
	
		escreva("Valor da diagonal principal: ", soma)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */