package br.com.cap5;

import java.io.*;

/*
 * Considere como exemplo um programa semelhante ao programa anterior, mas com o uso
 * da classe BufferedReader. A classe BufferedReader necessita de um tratamento de 
 * dados, diferentemente da classe Scanner, que efetua o tratamento automaticamente. 
 * Nesse caso, o programa a seguir transformará o conteúdo fornecido como String em 
 * seus equivalentes para o tio int (no caso da idade) e float (no caso da altura). 
 */

public class C05EX11 {

	public static void main(String[] args) {
		
		String IDADETXT, ALTURATXT;
		int IDADE;
		float ALTURA;
		
		System.out.println();
		
		System.out.print("Idade: ");
		try {
			BufferedReader br = new BufferedReader (
					new InputStreamReader(System.in));
					IDADETXT = br.readLine(); }
		catch (Exception e) {
			IDADETXT = "";
		}
		
		System.out.print("Altura: ");
		try {
			BufferedReader br = new BufferedReader (
					new InputStreamReader(System.in));
					ALTURATXT = br.readLine(); }
		catch (Exception e) {
			ALTURATXT = "";
		}
		
		IDADE = Integer.valueOf(IDADETXT).intValue();
		ALTURA = Float.valueOf(ALTURATXT).floatValue();
		
		System.out.println();
		
		if (IDADE <= 1)
			System.out.println("Idade: " + String.valueOf(IDADE) + " ano");
		else
			System.out.println("Idade: " + String.valueOf(IDADE) + " anos");
		System.out.println("Altura: " + String.valueOf(ALTURA) + "m");
		
		System.out.println();
		
	}

}
