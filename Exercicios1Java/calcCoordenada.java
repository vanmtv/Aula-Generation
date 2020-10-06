package PacoteJava;

import java.util.Scanner;
import java.lang.Math;

public class calcCoordenada {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("Digite x1");
		x1 = ler.nextDouble();
		
		System.out.println("Digite x2");
		x2 = ler.nextDouble();
		
		System.out.println("Digite y1");
		y1 = ler.nextDouble();
		
		System.out.println("Digite y2");
		y2 = ler.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
				
		System.out.printf("Distância = %.2f", d);
	}
}
