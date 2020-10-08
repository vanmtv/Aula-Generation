package ExercJavaLacosRep;
import java.util.Scanner;

public class Exerc5DoWhile {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num=1, soma=0;
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma +=num;
		}
		while(num!=0);
		System.out.println("Soma: " + soma);
	}
}
