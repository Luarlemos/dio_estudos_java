package com.nivel.basico;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] Args) {

	     double h = 0;
	     Scanner sc = new Scanner(System.in);
	     double n = sc.nextDouble();
	     double aux = 0;
	     
	     for (int i = 1; i <= n; i++) {
	     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
	        aux = (double)i;
	        h = h + 1/aux;
	      }
	     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
	       System.out.println(Math.round(h));
	   }
}
