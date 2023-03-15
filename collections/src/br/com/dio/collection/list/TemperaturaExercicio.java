package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

public class TemperaturaExercicio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> temperaturas = new ArrayList<Double>();
		
		// Adicionando as temperaturas na lista:
		for(int i=0; i<6; i++) {
			System.out.print("Digite a temperatura: ");
			double temp = scan.nextDouble();
			temperaturas.add(temp);
		}
		System.out.println("-----------------");
		
		//exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        //temperaturas.forEach(t -> System.out.print(t + " "));
        for(int i=0;i<6;i++) {
        	System.out.print(temperaturas.get(i) + " ");
        }
        
      //calculando e exibindo a m�dia das temperaturas:
        Iterator<Double> iterator = temperaturas.iterator();
        
        Double soma = 0.0;
        Double media;
        while(iterator.hasNext()) {
        	Double next = iterator.next();
        	soma += next;
        }
        media = soma/temperaturas.size();
        System.out.printf("\nM�dia das temperaturas: %.1f\n", media);
        
      //exibindo as temperaturas acima da m�dia
//        Iterator<Double> iterator1 = temperaturas.iterator();
//        while(iterator1.hasNext()) {
//        	Double next = iterator1.next();
//        	if(next < media) {
//        		iterator1.remove();
//        		
//        	}
//        }
//        System.out.println(temperaturas);
        System.out.print("Temperaturas acima da m�dia: ");
        for(int i=0; i<6; i++) {
        	if(temperaturas.get(i) > media) {
        		System.out.printf("%.1f ",temperaturas.get(i));
        	}
        }
        
      //exibindo o m�s das temperaturas acima da m�dia por extenso:
        System.out.println("\n\nMeses das temperaturas acima da m�dia: ");
        Iterator<Double> iterator2 = temperaturas.iterator();
        int count = 0;
        
        while(iterator2.hasNext()) {
        	Double temp = iterator2.next();
        	if(temp > media) {
        		switch(count) {
	        		case (0):
	        			System.out.printf("1 - janeiro: %.1f\n ", temp);
	        			break;
	        		case (1):
	        			System.out.printf("2 - fevereiro: %.1f\n ", temp);
	        			break;
	        		case (2):
	        			System.out.printf("3 - mar�o: %.1f\n ", temp);
	        			break;
	        		case (3):
	        			System.out.printf("4 - abril: %.1f\n ", temp);
	        			break;
	        		case (4):
	        			System.out.printf("5 - maio: %.1f\n ", temp);
	        			break;
	        		case (5):
	        			System.out.printf("6 - junho: %.1f\n ", temp);
	        			break;
	        		default:
	        			System.out.println("N�o houve temperatura acima da m�dia.");
        		
        		}
        	}
        	count++;
        }

	}

}
