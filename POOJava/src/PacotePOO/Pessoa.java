package PacotePOO;
import java.util.Scanner;

public class Pessoa {
	private String primeiroNome;
	private String nomesDoMeio;
	private String ultimoNome;

	//Construtor - mesmo nome da classe, seguido dos nomes que queira
	public Pessoa(String primeiro, String meio, String ultimo) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
}
