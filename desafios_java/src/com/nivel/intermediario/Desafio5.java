package com.nivel.intermediario;

import java.io.IOException;
import java.util.Scanner;

public class Desafio5 {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    double renda = leitor.nextDouble();
    double imposto=0,imposto2=0,imposto3=0,imposto4=0;
    double totalImposto;
 
      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
      if(renda <= 2000){
        System.out.println("Isento");
      }else{
        imposto = renda - 2000;
        if(imposto<=1000){
          imposto2 = imposto*0.08;
          totalImposto = imposto2;
          System.out.println(String.format("R$ %.2f",totalImposto));
        }else if(imposto>1000){
          imposto2 = 1000*0.08;
          imposto = renda - 3000;
          if(imposto<=1500){
            totalImposto = imposto2 + imposto*0.18;
            System.out.println(String.format("R$ %.2f",totalImposto));
          }else if(imposto>1500){
            imposto3 = 1500*0.18;
            imposto2 = 1000*0.08;
            imposto = renda - 4500;
            totalImposto = imposto2+imposto3+imposto*0.28;
            System.out.println(String.format("R$ %.2f",totalImposto));
          }
        }
      }
      
    }
    
	
}
