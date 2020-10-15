package PacoteExercPOO;

public class TestePatinete {
	public static void main(String args[]) 
	{
		Patinete patUber = new Patinete();
		patUber.empresa = "Uber";
		patUber.modelo = "street";
		patUber.valor = 2.00;
		patUber.regiao = "Zona Sul";
		patUber.carga = false;
		
		patUber.mostrarInfos();
		patUber.mostrarCarga();
	}
}
