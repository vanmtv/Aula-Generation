package ExercJavaLacosRep;
import java.util.Scanner;

public class Exerc6DoWhile {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num=1;
		double media, soma=0, cont=0;
		do {
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			if(num%3==0) {
			soma +=num;
			cont++;
			if(num==0) {
				cont--;
			}}
		}
		while(num!=0);
		media = soma/cont;
		System.out.printf("Media: %.2f", media);
	}
}
