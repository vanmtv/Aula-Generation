package ExercPOO1510;

public class TestExerc1 {
	public static void main(String args[]) 
	{
		PessoaExerc1 angelo = new PessoaExerc1("Angelo","Rua Magica", "22221111");
		AlunoExerc1 alicia = new AlunoExerc1("Alicia", "Rua Ficcao", "99881212", "4o semestre");
		ProfessorExerc1 bernice = new ProfessorExerc1("Bernice", "Avenida Brasil", "44552211", "Engenharia Software");
		
	angelo.movimentar();
	System.out.println(bernice.getDisciplina());
	System.out.println(alicia.getNome());
	alicia.mostrarEndereco(alicia.getEndereco());
}
}
