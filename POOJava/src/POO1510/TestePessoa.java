package POO1510;

public class TestePessoa {
	public static void main(String args[])
	{
		Pessoa jessica = new Pessoa("Jessica", 102);
		Funcionario1 pedro = new Funcionario1("Pedro", 222, "TI");
		Pessoa maria = new Funcionario1("Maria", 302, "Desenvolvimento");
		Pessoa jose = new Coordenador("Jose", 555, "Ciências");	
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	}
}
