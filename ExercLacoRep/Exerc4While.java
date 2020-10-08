package ExercJavaLacosRep;

import java.util.Scanner;

public class Exerc4While {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int total = 0, idade, def, pc=0, mn=0, ha=0, oc=0, pn=0, pn40=0, pc18=0, sexo;
		while(total<150) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.println("Sexo: \n 1- Feminino \n 2- Masculino \n 3-Outros");
			sexo = ler.nextInt();
			System.out.println("Se define como: \n1- Pessoa calma \n2-Pessoa nervosa \n3-Pessoa agressiva");
			def = ler.nextInt();
			
			switch(def) {
			case 1:
				pc++;
				if(idade<=18) 
					pc18++;
				if(sexo==3)
					oc++;
			break;
			case 2:
				if(sexo==1)
					mn++;
				if(idade>=40)
					pn40++;
			break;
			
			case 3:
				if(sexo==2)
					ha++;
			break;
			}
			total++;
		}
		System.out.println("Pessoas calmas: "+pc);
		System.out.println("Mulheres nervosas: "+mn);
		System.out.println("Homens agressivos: "+ha);
		System.out.println("Outros calmos: "+oc);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+pn40);
		System.out.println("Pessoas calmas com menos de 18 anos: "+pc18);
	}
}
