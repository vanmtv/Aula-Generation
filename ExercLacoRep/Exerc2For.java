package ExercJavaLacosRep;
import java.util.Scanner;

public class Exerc2For {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);

		int i, vetor[] = new int[10], par=0, impar = 0;
		for(i=0;i<10;i++) {
			System.out.println("Digite o " + (i+1) + " numero: ");
			vetor[i] =  ler.nextInt();
			if(vetor[i]%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
			System.out.printf("\nQuantidade de Par: %d", par);
			System.out.printf("\nQuantidade de impar: %d", impar);
	}
}
