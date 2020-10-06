package PacoteJava;

import java.util.Scanner;

public class eqLineares {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite a: ");
		a = ler.nextDouble();
		
		System.out.println("Digite b: ");
		b = ler.nextDouble();
		
		System.out.println("Digite c: ");
		c = ler.nextDouble();
		
		System.out.println("Digite d: ");
		d = ler.nextDouble();
		
		System.out.println("Digite e: ");
		e = ler.nextDouble();
		
		System.out.println("Digite f: ");
		f = ler.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e -b*d);
		
		System.out.printf("x = %.2f e y= %.2f", x, y);
	}
}
