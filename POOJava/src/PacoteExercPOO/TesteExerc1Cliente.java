package PacoteExercPOO;

public class TesteExerc1Cliente {
	public static void main(String args[]) {
		Exerc1Cliente cliente1 = new Exerc1Cliente();
		
		cliente1.entra();
		cliente1.mostraNome("Vanessa");
		cliente1.mostraCPF("12334188810");
		cliente1.paga(80, 30);
	}
}
