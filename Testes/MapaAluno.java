package Testes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String args[]) {
		Map<String, Aluno> mapa = new TreeMap<String,Aluno>();
	
		Aluno a = new Aluno("Joao S.", "Java", 6.8);
		Aluno b = new Aluno("Caos S.", "Linux", 8.0);
		Aluno c = new Aluno("Maria S.", "Redes", 9.0);
		Aluno d = new Aluno("Doao S.", "Redes", 9.8);
		
		mapa.put("Joao S.", a);
		mapa.put("Caos S.", b);
		mapa.put("Maria S.", c);
		mapa.put("Doao S.",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Maria S."));
		
		Collection<Aluno> alunos = mapa.values();
		
		for(Aluno e:alunos) {
			System.out.println(e);
		}
	}
}
