package ExercLacoCond;
import java.util.Scanner;
import java.lang.Math;
public class Exerc4ParImpar {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if(numero%2==0) {
			System.out.println(Math.sqrt(numero));
		}
		else {
			System.out.println(Math.pow(numero, 2));
		}
	}
}
