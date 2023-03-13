package com.nivel.basico;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) throws IOException {
	     Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
	     int cont = 0;
	     double media = 0;
	     double x = 0;
	     double numero;
	     //TODO: Implemente as condições adequadas para obter a quantidade 
	    //de valores positivos e a média dos valores positivos:
	        for (int i=0; i<6; i++) {
//	        	numero = Double.parseDouble(leitor.nextLine());
	        	numero = leitor.nextDouble();
	        	System.out.println(numero);
	        	if(numero>0){
	        	  x = x+numero;
	        	  cont++;
	        	}
	        }
	        
	        media = x/cont;
	        System.out.println(cont + " valores positivos");
	        System.out.println(String.format("%.1f", media));
	    }
}
