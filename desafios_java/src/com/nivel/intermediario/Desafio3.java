package com.nivel.intermediario;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio3{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);;
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		double area;
		boolean triangulo;
		String area2;
		String perimetro;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
		if((C > Math.abs(A-B)) && (A>Math.abs(C-B)) && (B>Math.abs(C-A))){
		  soma = A + B + C;
		  perimetro = String.format("Perimetro = %.1f",soma);
		  //System.out.println('Perimetro = '+ String.format('%d',soma));
		  System.out.println(perimetro);
		}else{
		  area = ((A+B)*C)/2;
		  area2 = String.format("Area = %.1f",area);
		  System.out.println(area2);
		}
		
	}
	
}
