package Testes;

import java.util.HashSet;
import java.util.Set;

public class ListaAlunos {
	public static void main(String args[]) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Joao S.", "Java", 6.8);
		Aluno b = new Aluno("Caos S.", "Linux", 8.0);
		Aluno c = new Aluno("Maria S.", "Redes", 9.0);
		Aluno d = new Aluno("Doao S.", "Redes", 9.8);

		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
