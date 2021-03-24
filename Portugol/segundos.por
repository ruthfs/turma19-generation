programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro segundos, horas, minutos, segundos2

		escreva("Olá, qual o seu nome? ")
		leia (nome)
		escreva("Quantos segundos será o evento ? ")
		leia (segundos)

		horas = (segundos / 60)
		minutos = segundos%(60*60)/60
		segundos2 = segundos%(60*60)%60 

		escreva("A duração do evento, será de: ", horas, " horas, ", minutos, " minutos e ", segundos2, "segundos.")


		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */