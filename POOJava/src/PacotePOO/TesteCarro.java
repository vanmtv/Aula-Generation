package PacotePOO;

public class TesteCarro {
	public static void main(String args[]) {
		Carro meuCarro = new Carro();
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "Fiat Uno";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMax = 80;
		
		
		//chamar metodos
		
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}
}
