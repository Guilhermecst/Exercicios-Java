package br.com.cap4;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
 * O Programa a seguir é uma versão dos programas C04EX01.java e C04EX02.java, porém
 * dessa vez utilizaremos a classe Scanner que foi introduzida à partir do Java 1.5
 * (Java 5) e permite ações de entrada de dados de maneira mais simples.
 */

public class C04EX03 {

	public static void main(String args[]) {

		String NOME;
		int IDADE;
		float ALTURA;
		
		DecimalFormat df = new DecimalFormat();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite seu nome: ");
		NOME = s.nextLine();
		
		System.out.print("Digite sua idade: ");
		IDADE = s.nextInt();
		
		System.out.print("Digite sua altura: ");
		ALTURA = s.nextFloat();
		
		System.out.println();
		System.out.println("Nome: " + NOME);
		System.out.println("\nIdade: " + IDADE);
		df.applyPattern("0.00");
		System.out.println("\nAltura: " + df.format(ALTURA));
		System.out.println();
		
	}

}
