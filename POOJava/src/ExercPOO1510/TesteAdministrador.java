package ExercPOO1510;

public class TesteAdministrador {
	public static void main(String args[]) 
	{
		Administrador beatriz = new Administrador("Beatriz", "Rua Prudente, no 43", "55566677788", 917654511, 21, 500);
		Administrador angelo = new Administrador("Angelo", "Rua Dezessete, no 43", "33344477788", 917654511, 21, 500);
		
		beatriz.mostrarInfos();
		angelo.validarCpf();
				
	}
}
