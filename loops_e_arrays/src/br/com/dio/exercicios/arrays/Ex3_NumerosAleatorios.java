package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
 * Fa�a um Programa que leia 20 n�meros inteiros aleat�rios
 * (entre 0 e 100), armazene-os num vetor. Ao final mostre os 
 * n�meros e seus sucessores.
 */
public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0;i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nAntecessores dos Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero-1) + " ");
		}
		
		System.out.println("\nSucessores dos Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
		
	}

}
