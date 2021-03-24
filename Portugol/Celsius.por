programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		cadeia nome
		real fahrenheit
		escreva ("escreva seu nome:")
		leia (nome)

		escreva ("insira a temperatura em farenheit: ")
		leia (fahrenheit)

		real celsius = (fahrenheit - 32) * 5/9 
		escreva ("Olá ", nome, ", a temperatura em celsius é: ",Mat.arredondar(celsius, 1), "°C")


 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */