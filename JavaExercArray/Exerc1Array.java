package JavaExercArray;
import java.util.Scanner;

public class Exerc1Array {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[] A = {1,0,5,-2,-5,7};
		int soma=0, i;
		
		//soma os valores
		for(i=0;i<6;i++) {
			if(i==0 || i==1 ||i==5) {
			soma+=A[i];
			}
			if(i==4) {
				A[i]=100;
			}
		}
		System.out.println("Soma = "+soma);
		//mostra valor dos vetores
		for(i=0;i<6;i++) {
			System.out.printf("\nA[%d] = %d", i,  A[i]);
		}
		
	}
}
