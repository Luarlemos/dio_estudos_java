package com.nivel.basico;

import java.io.IOException;
import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
          if (i == N) System.out.println(anterior);
       
     //TODO: Implemente a condi��o ideal para que possamos obter os valores solicitados:
        	else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual; 
        	atual = proximo; 
        }
    }
}
