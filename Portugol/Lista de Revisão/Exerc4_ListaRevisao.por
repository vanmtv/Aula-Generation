programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*
		 4-	Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */
		 inteiro const SOMA2 = 2, SOMA1 = 1
		 real dividendo=1, divisor=1, i, soma=0
		 

		 enquanto(dividendo<=99.0){
		 soma = soma + (dividendo)/(divisor)
		 dividendo = dividendo+SOMA2
		 divisor = divisor+SOMA1
		 }
		escreva("Soma = ", mat.arredondar(soma,2))		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */