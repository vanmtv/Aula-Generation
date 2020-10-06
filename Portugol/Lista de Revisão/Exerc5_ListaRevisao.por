programa
{
	
	funcao inicio()
	{
		/*
		 5-	Faça um programa que leia um vetor de 5 posições para números reais e, depois, 
		 um código inteiro. Se o código for zero, finalize o programa; 
		 se for 1, mostre o vetor na ordem direta; 
		 se for 2, mostre o vetor na ordem inversa. 
		 Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
		 */
		 real vetor[5]
		 inteiro codigo, i=0
		 
		faca{
			escreva("Digite um numero: ")
		 	leia(vetor[i])
		 	i++
		}
		enquanto(i<5){
		
		escreva("\n1 - ORDEM DIRETA ou \n2 - ORDEM INVERSA ou \n0 - SAIR \nDigite o codigo: ")
		leia(codigo)

		escolha(codigo){
			caso 0: 
				escreva("\nFim do programa")
			caso 1: 
				escreva("\nOrdem  direta: ")
				para(i=0;i<=4;i++){
					escreva(vetor[i], " ")	
				}
			  	pare
			caso 2:
				escreva("\nOrdem inversa: ")
				para(i=4;i>=0;i--){
					escreva(vetor[i], " ")	
				}	
				pare
			caso contrario:
				escreva("Opção invalida")
				
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */