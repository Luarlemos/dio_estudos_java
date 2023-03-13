package com.nivel.intermediario;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     String str = sc.nextLine();
	     String[] strSplit = str.split(" ");
	     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
	     char[] stringToChar;
	     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
	     
//	     System.out.println(strSplit);
	    for (String item : strSplit) {
//	    	System.out.println(item.toLowerCase());
//	    	System.out.println(item.length());
//	    	System.out.println(item.split(""));
	    	item = item.toLowerCase();
	   //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
	  //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
	    	stringToChar= item.toCharArray();
	    	
	        for(int i=0; i< stringToChar.length;i++){
	          for(int j = 0; j< arrVogais.length;j++){
	            if(stringToChar[i] == Character.toLowerCase(arrVogais[j])){
	              quantVogais++;
	            }
	          }
	        }
	    }
	    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
	}

}
