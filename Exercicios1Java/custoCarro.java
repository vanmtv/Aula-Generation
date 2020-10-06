package PacoteJava;

import java.util.Scanner;

public class custoCarro {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		double cC, cF, d=0.28, i = 0.45;
		
		System.out.println("Digite o custo de fábrica");
		cF = ler.nextDouble();
		
		cC = cF+ cF*d + cF*i;
		
		System.out.printf("Custo do Carro Novo R$ %.2f", cC);
	}
}
