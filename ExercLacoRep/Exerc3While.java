package ExercJavaLacosRep;
import java.util.Scanner;

/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos.
 * O programa termina quando idade for =-99. (WHILE)
*/
public class Exerc3While {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade=0, cont21=0, cont50=0;
		
		while(idade!= -99) {
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			if(idade<=21) {
				cont21++;
			}
			else if(idade>=50) {
				cont50++;
			}
		}
		System.out.printf("Total de pessoas até 21 anos: %d",cont21);
		System.out.printf("Total de pessoas com mais de 50 anos: %d",cont50);
	}
}
