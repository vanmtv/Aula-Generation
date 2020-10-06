package PacoteJava;

import java.util.Scanner;

public class idadePessoa2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, ano, mes, dia;
		
		System.out.println("Digite sua idade expressa em dias: ");
		idade = ler.nextInt();
		
		ano = 2020 - idade/365;
		mes = (idade%365)/30;
		dia = (idade%365)%30;
		
		System.out.printf("Data: %d/%d/%d", ano, mes, dia);

	}
}
