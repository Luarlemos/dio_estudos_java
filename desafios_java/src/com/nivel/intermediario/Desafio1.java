package com.nivel.intermediario;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();

		//TODO: Implemente as condi��o necess�ria para que seja verificado que tipo de animal �:
               //Dica: Voc� pode utilizar o m�todo equals para realizar compara��es.
    if(AN1.equals("vertebrado")){
      if(AN2.equals("ave")){
        if(AN3.equals("carnivoro")){
          System.out.println("aguia");
        }else{
          System.out.println("pomba");
        }
      }else{
        if(AN3.equals("onivoro")){
          System.out.println("homem");
        }else{
          System.out.println("vaca");
        }
      }
    }else{
      
      if(AN2.equals("inseto")){
        if(AN3.equals("hematofago")){
          System.out.println("pulga");
        }else{
          System.out.println("lagarta");
        }
      }else{
        if(AN3.equals("hematofago")){
          System.out.println("sanguessuga");
        }else{
          System.out.println("minhoca");
        }
      }
    }
               
               
	}
}
