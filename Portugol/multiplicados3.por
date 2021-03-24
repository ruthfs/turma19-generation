/*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) até que ele seja maior do que 100. 
 * Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */

programa
{
	
	funcao inicio()
	{
		inteiro num 
		
		escreva ("Digite aqui, um numero para ser multiplicado por 3: ")
		leia(num)
		limpa ()
		
		enquanto (num<200) {
			escreva (num, "\n")
			num = num * 3
		} se (num < 200){
			escreva (num, "\n")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */