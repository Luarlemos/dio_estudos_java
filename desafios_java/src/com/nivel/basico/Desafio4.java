package com.nivel.basico;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args){
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();

//TODO: Implemente a condi��o adequada para a impress�o dos textos conforme o solicitado no desafio:

            if(poderDeLuta<=8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
}
}
