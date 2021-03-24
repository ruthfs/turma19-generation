programa
{
	inclua biblioteca Matematica
 --> Mat
	
	funcao inicio()
	{
		real pesoTomate
		real excesso
		real multa = 0.0
		real total

		escreva("Qual o peso em kg de tomates ?")
		leia(pesoTomate)

		se (pesoTomate<=50){
			escreva("O peso esta no alcance aceito, é isento de taxa")
		}
		se (pesoTomate > 50) {
		excesso = pesoTomate-50
		multa = 4
		total = excesso*multa
		escreva("O peso excedeu o limite, sera cobrado o valor de", total, " R$")
		
		
		
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */