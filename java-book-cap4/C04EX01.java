package br.com.cap4;

import java.io.*;

/* 
 * O programa a seguir efetuará a solicitação do nome, da idade e da altura
 * e apresentará no monitor de vídeo os dados informados após a entrada.
 */

class C04EX01 {

	public static void main(String args[]) {
		
		String NOME;
		int IDADE;
		float ALTURA;
		
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
		System.out.println("Nome .........: " + NOME);
		System.out.println("\nIdade .........: " + IDADE);
		System.out.println("\nAltura .........: " + ALTURA);
		System.out.println();
	}

}
