programa
{
	
	funcao inicio()
	{
		/*
		 3-	Escrever um programa que leia uma quantidade desconhecida de números e 
		 conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
		 A entrada de dados deve terminar quando for lido um número negativo.
		 */
		inteiro n=1, int1=0, int2=0, int3=0, int4=0

		enquanto(n>=0){
			escreva("Digite um numero: ")
			leia(n)
			se(n<0){
				escreva("FIM DO PROGRAMA")
			}
			senao se(n>=0 e n<=25){
				int1++
			}
			senao se(n>=26 e n<=50){
				int2++
			}
			senao se(n>=51 e n<=75){
				int3++
			}
			senao se(n>=76 e n<=100){
				int4++
			}
		 }
		 limpa()
		 
		 escreva("\n\n----------------Resultado--------------------")
		 escreva("\nQuantidade de numeros no Intervalo [0-25]: ", int1)
		 escreva("\nQuantidade de numeros no Intervalo [26-50]: ", int2)
		 escreva("\nQuantidade de numeros no Intervalo [51-75]: ", int3)
		 escreva("\nQuantidade de numeros no Intervalo [76-100]: ", int4)
		 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 639; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */