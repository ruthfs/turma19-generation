programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro dias
	
		escreva("Olá, qual o seu nome? ")
		leia (nome)
		escreva("Quantos dias vividos, você tem ? ")
		leia (dias)

		inteiro anos = dias / 365
		inteiro meses = dias%365/30
		inteiro diasVividos = dias%365%30

		escreva(nome, ","," você tem ", anos, " anos, ", meses, " meses e ", diasVividos, "  de dias ")
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */