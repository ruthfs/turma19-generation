//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.3

programa
{
	
		funcao inicio()
		{
			inteiro valor [5], x
			inteiro maiorValor = 0
	
			para (x=0; x<5; x++){
				escreva("Digite um valor: ")
				leia (valor[x])
			se (valor[x] > maiorValor){
					maiorValor = valor[x]
				}
			}
			escreva("O maior valor é : ", maiorValor)
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */