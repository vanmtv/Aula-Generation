package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main(String args[]) {
		Collection<String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Marina");
		nomes.add("Rafaela");
		
		for(String name: nomes) {
			System.out.println("Lista de nomes: "+name);
		}
		
		Collection<String> nomes2 = Arrays.asList("Joao", "Joana");
		System.out.println("Lista de nomes: "+nomes2);

		//System.out.println("Contem o nome Maria?" + nomes.contains("Maria"));
	//	System.out.println("Lista"+nomes);
	/*	System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Mario");
		System.out.println("Lista de nomes: "+nomes);
		nomes.clear();
		
		 if(nomes.isEmpty()) {
			System.out.println("Lista vazia");
		}
		else {
			System.out.println("Lista de nomes: "+nomes);
		}*/
	}
}
