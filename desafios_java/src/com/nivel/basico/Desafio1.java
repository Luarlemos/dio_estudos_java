package com.nivel.basico;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {

	  Scanner scan = new Scanner(System.in);
      int custoFabrica = scan.nextInt();
	  int porcentagemDistribuidor = scan.nextInt();
	  int PercentualImpostos = scan.nextInt();

      int custoConsumidor;
     
      int Distribuidor;
      int ValorImpostos;
 
      // TODO: Implemente uma condi��o que calcule a porcentagem do distribuidor e dos impostos:
 
      Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        
      ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        
      custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;
      
 
      System.out.println(custoConsumidor);
	}
}
