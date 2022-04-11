package br.com.cap4;

import java.io.*;
import java.text.DecimalFormat;

/* 
 * O Programa a seguir é uma versão do programa C04EX01.java. Nessa versão, o valor
 * da altura (valor numérico real) será apresentado num formato visual um pouco di-
 * ferente.
 */

public class C04EX02 {

	public static void main(String args[]) {

		String NOME;
		int IDADE;
		float ALTURA;
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println();
		
		System.out.print("Digite seu nome: ");
		try {
			BufferedReader br = new BufferedReader (
			new InputStreamReader(System.in));
			NOME = br.readLine(); }
		catch (Exception e) {
			NOME = "";
		}
		
		System.out.print("Digite sua idade: ");
		try {
			BufferedReader br = new BufferedReader (
			new InputStreamReader(System.in));
			IDADE = Integer.parseInt(br.readLine()); }
		catch (Exception e) {
			IDADE = 0;
		}
		
		System.out.print("Digite sua altura: ");
		try {
			BufferedReader br = new BufferedReader (
			new InputStreamReader(System.in));
			ALTURA = Float.parseFloat(br.readLine()); }
		catch (Exception e) {
			ALTURA = 0;
		}
		
		System.out.println();
		System.out.println("Nome: " + NOME);
		System.out.println("\nIdade: " + IDADE);
		df.applyPattern("0.00");
		System.out.println("\nAltura: " + df.format(ALTURA));
		System.out.println();
		
	}

}
