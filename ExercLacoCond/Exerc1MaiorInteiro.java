package ExercLacoCond;
import java.util.Scanner;

public class Exerc1MaiorInteiro {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.printf("Entre com o primeiro numero: ");
		a = ler.nextInt();
		
		System.out.printf("Entre com o segundo numero: ");
		b = ler.nextInt();
		
		System.out.printf("Entre com o terceiro numero: ");
		c = ler.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + " é maior que " + b + " e maior que " + c);
		}
		else if(b>a && b>c) 
		{
			System.out.println(b + " é maior que " + a + " e maior que " + c);
		}
		else if(c>a && c>b) 
		{
			System.out.println(c + " é maior que " + b + " e maior que " + a);
		}
	}
}
