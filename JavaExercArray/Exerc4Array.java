package JavaExercArray;
import java.util.Scanner;

public class Exerc4Array {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] soma = new float[2][2];
		float[][] sub = new float[2][2];
		int op=1, i, j;
		final float k = 2.0F;
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.printf("\nDigite o valor da M1[%d][%d]: ", (i+1), (j+1));
				m1[i][j] = ler.nextFloat();
			}
		}
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.printf("\nDigite o valor da M2[%d][%d]: ", (i+1), (j+1));
				m2[i][j] = ler.nextFloat();
			}
		}

		do {
			System.out.println("Digite o operação desejada");
			System.out.println("1 - Somar as duas matrizes");
			System.out.println("2 - Subtrair a primeira matriz da segunda");
			System.out.println("3 - Adicionar uma constante as duas matrizes");
			System.out.println("4 - Imprimir as matrizes");
			op = ler.nextInt();
		}
		while(op<1 || op>4);
		
		switch(op) {
		case 1:
			System.out.println("Soma das matrizes: ");
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					soma[i][j] = m1[i][j]+m2[i][j];
					System.out.printf("\t %.2f \t", soma[i][j]);
				}
			System.out.println();
			}
		break;
		case 2:
			System.out.println("Subtração das matrizes: ");
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					sub[i][j] = m2[i][j]-m1[i][j];
					System.out.printf("\t %.2f \t",sub[i][j]);
				}
				System.out.println();
			}
		break;
		case 3:
			System.out.println("Adicionar uma constante as duas matrizes: ");
			System.out.printf("\nMatriz 1 + contante K = %.2f\n", k);
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					m1[i][j] += k;
					m2[i][j] += k;
					System.out.printf("\t %.2f \t", m1[i][j]);
				}
				System.out.println();
			}
			System.out.printf("\nMatriz 2 + contante K = %.2f\n", k);
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					System.out.printf("\t %.2f \t", m2[i][j]);
			}
			System.out.println();
		}
		break;
		case 4:
			System.out.println("Matriz 1");
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					System.out.printf("\t %.2f \t", m1[i][j]);
			}
			System.out.println();
		}
			System.out.println("Matriz 2");
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					System.out.printf("\t %.2f \t", m2[i][j]);
			}
			System.out.println();
		}
		break;
		default: 
			System.out.println("Algo deu errado");
		}

	}
}
