package PacoteExercPOO;

public class Patinete {
	public String empresa;
	public double valor;
	public String regiao;
	public String modelo;
	public boolean carga;
	
	public void mostrarInfos(){
		System.out.println("Patinete \nEmpresa:" + empresa + " \nValor: " + valor + "\nRegiao: "+regiao + "\nModelo: "+modelo);
	}
	
	public void mostrarCarga() {
		if(carga) {
			System.out.println("Patinete " + empresa +" carregado.");
		}
		else {
			System.out.println("Patinete " + empresa +" descarregado. Procure outra alternativa.");
		}
	}
	
}
