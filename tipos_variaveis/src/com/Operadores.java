package com;

public class Operadores {

	public static void main(String[] args) {
		String nomeCompleto = "Linguagem" + " " + "Java";
		System.out.println(nomeCompleto);
		
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1";
		
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1;
		
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1";
		
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1;
		
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1+1);
		
		System.out.println(concatenacao);
		
		int numero = 5;
		
		System.out.println(- numero);
		
		System.out.println(numero);
		
		numero = numero + 2;
		
		System.out.println(numero);
		
		numero ++; //numero = numero+1
		
		System.out.println(numero);
		
		numero --;
		System.out.println(numero);
		
		boolean variavel = true;
		
		variavel = !variavel;
		System.out.println(variavel);
		
		// Operador Ternário
		int a,b;
		a=5;
		b=5;
		String resultado = a==b ? "verdadeiro": "falso";
		
		/*
		 * if (a==b) resultado = "verdadeiro"; 
		 * else resultado = "falso";
		 */
		
		System.out.println(resultado);
		
		int num1 = 1;
		int num2 = 2;
		
		boolean simNao = num1 == num2;
		
		System.out.println("numero1 é igual ao numero2: "+simNao);
		
		simNao = num1 != num2;
		
		System.out.println("numero1 é diferente ao numero2: "+simNao);
		
		simNao = num1 > num2;
		
		System.out.println("numero1 é maior que o numero2: "+simNao);
		
		String nome1 = "Luciana";
		String nome2 = new String("Luciana");
		
		System.out.println(nome1==nome2);
		System.out.println(nome1.equals(nome2));
		
		//Operadores Lógicos
		// &&
		// ||
		
		boolean cond1 = true;
		boolean cond2 = false;
		
		if(cond1 && cond2) {
			System.out.println("As duas condicoes sao verdadeiras");
		}
		if(cond1 || cond2) {
			System.out.println("Uma das condicoes é verdadeira");
		}
	}

}
