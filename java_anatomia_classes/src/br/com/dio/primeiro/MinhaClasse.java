package br.com.dio.primeiro;

public class MinhaClasse {
	public static void main(String[] args) {
		System.out.println("Ol� turma, sejam bem-vindos");
		
		// Vari�veis
		/*
		int ano = 2022;
		ano = 2023;
		
		final String BR = "Brasil";
		
		String meuNome = "Luciana";
		
		int anoFabricacao = 2022;
		
		boolean verdadeira = true;
		
		anoFabricacao = 2023;
		*/	
		
		String primeiroNome = "Luciana";
		String segundoNome = "Lemos";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do m�todo: " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
