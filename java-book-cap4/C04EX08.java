package br.com.cap4;

import java.util.Scanner;

/* 
 * O programa seguinte efetua a leitura do nome e do sexo de duas pessoas e determina
 * se a partir do sexo fornecido essas pessoas podem ou n�o dan�ar a quadrilha, pois
 * seus organizadores determinaram que os casais para a dan�a devem ser formados por
 * pares hetrog�neos.
 */

public class C04EX08 {

	public static void main(String args[]) {
		
		String NOME1, NOME2;
		int SEXO1, SEXO2;
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner s2 = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o 1� nome: ");
		NOME1 = s1.next();
		
		System.out.print("Digite [1] para o sexo Masculino ou [2] para o sexo Feminino");
		SEXO1 = s1.nextInt();
		
		System.out.print("Digite o 2� nome: ");
		NOME2 = s2.next();
		
		System.out.print("Digite [1] para o sexo Masculino ou [2] para o sexo Feminino");
		SEXO2 = s2.nextInt();
		
		if (SEXO1 == 1 ^ SEXO2 == 1)
			System.out.println(NOME1 + " pode dan�ar com " + NOME2);
		else
			System.out.println(NOME1 + " n�o pode dan�ar com " + NOME2);
		
		System.out.println();
	}

}
