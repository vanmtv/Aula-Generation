package POO1510;

public class TestandoFuncionario {
	public static void main(String args[]) 
	{
		Funcionario func = new Funcionario();
		func.setNome("Vanessa");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}
}
