package JavaExercArray;
import java.util.Scanner;

public class Exerc3Array {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int i=0, j, cont10=0;
		int[][] matriz = new int[3][3];
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.printf("\nDigite o valor da matriz[%d][%d]: ",(i+1),(j+1));
				matriz[i][j] = ler.nextInt();
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(matriz[i][j]>10) {
					cont10++;
					System.out.printf("\nMatriz[%d][%d] = %d > 10", (i+1), (j+1), matriz[i][j]);
				}
			}
		}
		System.out.println("\nQuantidade de números maiores que 10: " +cont10);
	}
}
