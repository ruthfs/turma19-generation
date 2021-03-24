/*1- Faça um programa que mostre uma contagem na tela 
* de 233 a 456, só que contando de 3 em 3 quando estiver 
* entre 300 e 400 e de 5 em 5 quando não estiver
 */

programa
{
	
	funcao inicio()
	{
		inteiro valor1 = 233

		faca {

			se (valor1 >= 233 e valor1 < 400){
				escreva(valor1, " + 3 =")
			valor1 =	valor1 + 3 
			escreva (valor1, "\n")
			} 
			senao {
				escreva(valor1, " + 5 =")
				valor1 = valor1 + 5
				escreva (valor1, "\n")
			}

		}
		enquanto (valor1 < 456) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */