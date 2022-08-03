programa
{
	
	funcao inicio()
	{
		inteiro numero 
		
		escreva("Insira o numero aqui: ")
		leia(numero)

		 se ((numero == 0)) {
				escreva("Zero é neutro")
		 }

		 senao se (numero <0){
		 	escreva ("Não posso calcular, número negativo")
		 	
		 }

			senao se ((numero % 2 ) == 0) {
			escreva ("o numero é par\n")
		 
				
				}senao {
			escreva("O nuemero é impar\n")
			}
			
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */