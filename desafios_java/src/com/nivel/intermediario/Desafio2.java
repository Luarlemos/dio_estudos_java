package com.nivel.intermediario;

import java.util.*;

public class Desafio2 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       double totalMorango;
       double totalMaca;
       double totalCompra;
       int frutas = morangos+macas;

//TODO: Implemente as condi��es necess�rias para retornar o pre�o a ser pago pelo cliente, conforme a tabela de pre�os do seu Z�:
      if (morangos <= 5){
        totalMorango = 2.5*morangos;
      }else{
        totalMorango = 2.2*morangos;
      }
      
      if (macas <= 5){
        totalMaca = 1.8*macas;
      }else{
        totalMaca = 1.5*macas;
      }
      
      totalCompra = totalMorango + totalMaca;
      
      if((frutas > 8) || totalCompra>25){
        totalCompra = 0.9*totalCompra;
        System.out.println(totalCompra);
      }else{
        System.out.println(totalCompra);
      }
      
      
    }
}
