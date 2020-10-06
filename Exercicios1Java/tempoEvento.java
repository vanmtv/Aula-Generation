package PacoteJava;
import java.util.Scanner;


public class tempoEvento {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int tempo, hora, minuto, segundo;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempo = ler.nextInt();
		
		hora = tempo/3600;
		minuto = (tempo/60)%60; 
		segundo = tempo%60;
			
		System.out.printf("%dh %dmin %dseg", hora, minuto, segundo);
}
}