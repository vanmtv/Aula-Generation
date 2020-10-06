programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*2-	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso
		*/
		real peso, altura, imc
		escreva("Digite a altura em metros: ")
		leia(altura)
		escreva("Digite o peso: ")
		leia(peso)

		imc = peso/mat.potencia(altura,2)
		
		se (imc<18.5){
			escreva("\nPeso abaixo do normal")
		}
		senao se(imc<25){
			escreva("\nPeso normal")
		}
		senao se(imc<30){
			escreva("\nAcima do peso")
		}
		senao{
			escreva("Obeso")
		}
		escreva("\n\nFIM DO PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 688; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */