package PacoteExercPOO;

public class TesteExerc2Aviao {
	public static void main(String args[])
	{
		Exerc2Aviao aviao1 = new Exerc2Aviao();
		
		aviao1.cor = "branco";
		aviao1.modelo = "Airbus A320";
		
		
		aviao1.liga();
		aviao1.acelera(80);
		aviao1.mostraModeloCor(aviao1.cor,aviao1.modelo);
		aviao1.mostraViagensDia(820);
	}
}
