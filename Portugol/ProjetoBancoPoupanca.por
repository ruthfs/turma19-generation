programa
{
	inclua biblioteca Util
	inteiro dia
	cadeia cpf
	funcao inicio()
	{
		//variaveis
		caracter opcao
		cadeia tipo
		//variaveis

		//laço
		faca {
		//entradas
		limpa()
		escreva("Banco Geração\n")
		escreva("Um banco feito para sua todes.\n")
		escreva("\n")
		escreva("Usuárie, escolha a opção correspondente ao seu tipo de conta\n")
		escreva("1 - Conta Poupança\n")
		escreva("2 - Conta Corrente\n")
		escreva("3 - Conta Especial\n")
		escreva("4 - Conta Empresa\n")
		escreva("5 - Conta Estudantil\n")
		escreva("6 - Sair\n")
		escreva("Digite o número da sua opção: ")
		leia(opcao)
		limpa()	
		se (opcao == '1'){ //laço
			tipo = "Poupança"
			cabecalho(tipo)
			
			inteiro diaAniversarioPoupanca = 5
			real saldo = 0.0
			caracter res

			para (inteiro adicionar = 0; adicionar <=10; adicionar++){
			escreva("Você deseja adicionar saldo a sua poupança ?\n Sim (S) - Não (N): ")
			leia (res)
		
			se (res=='S' ou res=='s'){
			escreva("Qual o valor que você ira adicionar ?")
			leia(saldo)
			escreva("Que dia é hoje ? ")
			leia (dia)
			}
			senao se(res=='N' ou res=='n') {
			escreva("Você escolheu não adocionar novo saldo, operação encerrada!\n")
			pare
			}
			se (dia == diaAniversarioPoupanca){
			saldo = (saldo * 0.05)+saldo
			escreva ("A data informada é equivalente ao dia de faturamento da poupança, seu saldo atual é: ", saldo)	
			Util.aguarde(5000)
			}
			senao se (dia != diaAniversarioPoupanca){
			escreva ("O dia informado não bate com o dia de faturamento de sua poupança. O saldo é de ", saldo, " R$")
			}
			}
			}
			
		senao se (opcao == '2'){
			tipo = "Corrente"
			cabecalho(tipo)
			Util.aguarde(5000)
		}
			
		senao se (opcao == '3'){
			tipo = "Especial"
			cabecalho(tipo)
			Util.aguarde(2000)
		}
		senao se (opcao == '4'){
			tipo = "Empresa"
			cabecalho(tipo)
			Util.aguarde(2000)
		} 
		senao se (opcao == '5'){
			tipo = "Estudantil"
			cabecalho(tipo)
			Util.aguarde(2000)
		}
		senao se (opcao == '6'){
			escreva("Sair")
			Util.aguarde(2000)
			pare
		} senao {
			escreva("Número inválido.\n")
			Util.aguarde(2000)
		}//laço
		
		
	 } enquanto (opcao != '6') //laço 
	 escreva("\nFim.")
		} 
				
	
	funcao cabecalho (cadeia tipo){
		
		
		escreva("Banco Geração!\n")
		escreva("Um banco feito para sua todes.\n")
		escreva("\n")
		escreva("Conta ", tipo, "\n")
		escreva("Informe seu CPF: ")
		leia(cpf)
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1928; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */