/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine 
 * e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação
 */

programa
{

	
	funcao inicio()
	{
		inteiro dado[10]
		real media =0.0
		inteiro maiorNumero=0.0
		inteiro contador=0.0

		para (inteiro x=0; x<10; x++){
			
			escreva("Informe o valor do lançamento " , x+1, " de (1-6): ")
			leia(dado[x])
			media= media + dado[x]
			
			se (maiorNumero < dado[x]){
				maiorNumero = dado[x]
				contador=1	
			}
			senao se (maiorNumero==dado[x])
			{
				contador++
			}

			escreva("\n")
			media = media/10

			
		}
			para (inteiro x=0; x<10; x++)
			{
				escreva(dado[x]," | ")
			}
			
			escreva("\nMedia: ", media, "\nMaior lançamento: ", maiorNumero)
		
			
	} 
			
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */