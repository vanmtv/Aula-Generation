package JavaExercArray;
import java.util.Scanner;

public class Exerc2Array {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[5];
		int i, somaP=0, quantI=0;
		
		for(i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+" valor: ");
			vetor[i]=ler.nextInt();
			if(vetor[i]%2==0) {
				somaP+=vetor[i];
			}
			else {
				quantI++;
			}
		}
		
		for(i=0;i<vetor.length;i++) {
			if(vetor[i]%2==0) {
				System.out.println("Par: "+vetor[i]);
			}
			else{
				System.out.println("Impar: "+vetor[i]);
			}
		}
		System.out.println("Soma dos pares = "+somaP);
		System.out.println("Quantidade de números impares: "+quantI);
	}
}
