package PacoteJava;

import java.util.Scanner;

public class mediaAluno {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("Digite a nota 1: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = ler.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		n3 = ler.nextDouble();
		
		media = n1*0.2 + n2*0.3 + n3*0.5;
		
		System.out.printf("Resultado = %.2f", media);
	}


}
