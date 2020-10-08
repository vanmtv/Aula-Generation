package ExercLacoCond;
import java.util.Scanner;

public class Exerc2OrdemCrescente {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o primeiro numero: ");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = ler.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		c = ler.nextInt();

		if(a<=b && b<=c) {
			System.out.println("Ordem crescente: "+ a + b + c);
		}
		else if(a<=c && c<=b) {
			System.out.println("Ordem crescente: "+ a + c + b);
		}
		else if(b<=a && a<=c) {
			System.out.println("Ordem crescente: "+ b + a + c);
		}
		else if(b<=c && c<=a) {
			System.out.println("Ordem crescente: "+ b + c + a);
		}
		else if(c<=a && a<=b) {
			System.out.println("Ordem crescente: "+ c + a + b);
		}
		else {
			System.out.println("Ordem crescente: "+ c + b + a);
		}
	}
			
}
