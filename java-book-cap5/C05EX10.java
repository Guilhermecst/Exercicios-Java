package br.com.cap5;

import java.util.Scanner;

/*
 * Considere como exemplo um programa que solicite a entrada de dois valores, um valor
 * do tipo inteiro(a idade de uma pessoa) e outro valor do tipo real (a altura de 
 * uma pessoa). Esse programa apresentará essas informações numéricas como sendo do tipo
 * String.
 */

public class C05EX10 {

	public static void main(String[] args) {
		
		int IDADE;
		float ALTURA;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Idade: ");
		IDADE = s.nextInt();
		
		System.out.println("Altura: ");
		ALTURA = s.nextFloat();
		
		System.out.println();
		
		if (IDADE <= 1)
			System.out.println("Idade: " + String.valueOf(IDADE) + " ano");
		else
			System.out.println("Idade: " + String.valueOf(IDADE) + " anos");
		System.out.println("Altura: " + String.valueOf(ALTURA) + "m");
		
		System.out.println();
	}

}
