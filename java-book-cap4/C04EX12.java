package br.com.cap4;

import java.util.Scanner;

/*
 * Tendo visto a primeira e a segunda vers�es do programa, a terceira vers�o far� o mesmo
 * processamento, mas utilizando a instru��o switch.
 */

public class C04EX12 {

	public static void main(String args[]) {
		
		int MES;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um valor referente � um m�s: ");
		MES = s.nextInt();
		
		System.out.println();
		
		switch (MES)
		{
		case 1:  System.out.println("Fevereiro");	 break;
		case 3:  System.out.println("Mar�o");		 break;
		case 4:  System.out.println("Abril");		 break;
		case 5:  System.out.println("Maio");		 break;
		case 6:  System.out.println("JUnho");		 break;
		case 7:  System.out.println("Julho");		 break;
		case 8:  System.out.println("Agosto");		 break;
		case 9:  System.out.println("Setembro");	 break;
		case 10: System.out.println("Outubro");		 break;
		case 11: System.out.println("Novembro");	 break;
		case 12: System.out.println("Dezembro");	 break;
		default: System.out.println("M�s inv�lido"); break;
		}
		
		System.out.println();
	}

}
