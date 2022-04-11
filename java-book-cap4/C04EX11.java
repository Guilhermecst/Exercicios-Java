package br.com.cap4;

import java.util.Scanner;

/*
 * Essa é uma versão do programa C04EX10.java que visa melhorar a legibilidade visual
 * do programa que faz uso de uma sequência bastante extensa de instruções do tipo if
 * encadeadas.
 */

public class C04EX11 {

	public static void main(String args[]) {
		
		int MES;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um valor referente à um mês: ");
		MES = s.nextInt();
		
		System.out.println();
		
		if (MES == 1)
			System.out.println("Janeiro");
		else if (MES == 2)
			System.out.println("Fevereiro");
		else if (MES == 3)
			System.out.println("Março");
		if (MES == 4)
			System.out.println("Abril");
		else if (MES == 5)
			System.out.println("Maio");
		else if (MES == 6)
			System.out.println("Junho");
		if (MES == 7)
			System.out.println("Julho");
		else if (MES == 8)
			System.out.println("Agosto");
		else if (MES == 9)
			System.out.println("Setembro");
		if (MES == 10)
			System.out.println("Outubro");
		else if (MES == 11)
			System.out.println("Novembro");
		else if (MES == 12)
			System.out.println("Dezembro");
		else
			System.out.println("Mês inválido");
		
		System.out.println();
		
	}

}
