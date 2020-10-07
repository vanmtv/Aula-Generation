package ExercLacoCond;

import java.util.Scanner;

public class Exerc3Categoria {
	public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	int idade;
	
	System.out.printf("Digite a idade: ");
	idade = ler.nextInt();
	
	if(idade>=10 && idade<=14) {
		System.out.println("Categoria infantil");
	}
	else if(idade>=15 && idade<=17) {
		System.out.println("Categoria juvenil");
	}
	else if(idade>=18 && idade<=25) {
		System.out.println("Categoria adulto");
	}
	else {
		System.out.println("Não existe categoria para essa idade");
	}
	}
}
