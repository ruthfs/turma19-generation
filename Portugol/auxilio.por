programa
{
	
	funcao inicio()
	{
	cadeia nome
	cadeia valor 
	
	
	escreva("Qual seu nome ?")
	leia (nome)

	escreva("Você é Chefa de familia ? Sim (1) Não (2) \n ")
	leia(valor)

	se (valor == "1" ) {
	escreva("Você receberá R$ 1200")
	}
	senao se (valor == "2"){
		escreva("Você receberá R$ 600")
		
	}

	senao {
	escreva("Não digitou, nem (1) nem (2), auxilio não disponivel")
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