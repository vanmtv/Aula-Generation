programa
{
	
	funcao inicio()
	{
		/*
		 1-	Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */
		inteiro opPag
		real preco
		escreva("Digite o preço do produto: ")
		leia(preco)
		
		escreva("\n\n1 - À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n2 - À vista no cartão de crédito, recebe 15% de desconto")
		escreva("\n3 -  Em duas vezes, preço normal de etiqueta sem juros")
		escreva("\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%")
		escreva("\n\nDigite a condição de pagamento: ")
		leia(opPag)

		escolha(opPag){
			caso 1: 
				preco = preco - preco*0.20
				escreva("\nValor a ser pago: R$", preco)
				pare
			caso 2: 
				preco = preco - preco*0.15
				escreva("\nValor a ser pago: R$", preco)
				pare
			caso 3: 
				escreva("\nValor a ser pago: R$", preco, " 2 vezes sem juros")
				pare
			caso 4:
				preco = preco + preco*0.10
				escreva("\nValor a ser pago: R$", preco, " 3 vezes com juros")
				pare
			caso contrario: 
				escreva("\nOpção inválida")
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */