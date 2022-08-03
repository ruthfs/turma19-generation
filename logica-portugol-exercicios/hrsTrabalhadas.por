programa {
	funcao inicio()
	{
		cadeia nome
		real salario
		real hrsTrabalhadas
		real hrsExtras

		escreva("Olá, qual seu nome ?\n")
		leia(nome)

		escreva("Quantas horas você trabalhou ?\n")
		leia(hrsTrabalhadas)

		salario = hrsTrabalhadas * 10
		hrsExtras = (hrsTrabalhadas - 50)*20


		escreva("O seu salario é de R$ ", salario, ", o valor de horas extras é de R$", hrsExtras)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 189; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */