package Testes;

public class ErrosTryCatch {
	public static void main(String args[]) {
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			System.out.println("Frase inicial é nula, para solucionar "
					+ "tal problema foi lhe atribuido valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase Antiga: "+frase);
		System.out.println("Frase Nova: "+novaFrase);

	}
}
