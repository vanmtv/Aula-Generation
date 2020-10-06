package PacoteJava;

import java.util.Scanner;
import java.lang.Math;

public class expressao {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, r, s;
		
		System.out.println("Digite a: ");
		a = ler.nextInt();
		
		System.out.println("Digite b: ");
		b = ler.nextInt();
		
		System.out.println("Digite c: ");
		c = ler.nextInt();
		
		r = (int) Math.pow((a+b), 2);
		s = (int) Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println(d);
	}

}
