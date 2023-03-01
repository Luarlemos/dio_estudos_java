package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero
 * e a m�dia desses n�meros.
 */
public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		double soma = 0;
		int count=0;
		
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			soma += numero;
			if (numero > maior) {
				maior = numero;
			}
			count++;
		} while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + (soma/count));
	}
}
