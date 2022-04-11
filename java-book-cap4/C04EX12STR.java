package br.com.cap4;

import java.util.Scanner;

/*
 * A instru��o switch aceita a defini��o de valores do tipo String a partir do Java 7.
 * Assim ap�s cada comando case pode-se fazer uso de um valor definido entre aspas
 * inglesas. Dessa forma, considere como exemplo desse tipo de aplica��o um programa 
 * id�ntico ao programa C04EX12.java, e em vez de se fazer a entrada de valores num�-
 * ricos entre 1 e 12 far�-se a entrada de strings (literais por extenso) como: um,
 * dois, tres (sem acento), quatro e assim por diante at� doze.
 */

public class C04EX12STR {

	public static void main(String args[]) {
		
		String MES;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um valor referente � um m�s: ");
		MES = s.nextLine();
		
		System.out.println();
		
		switch (MES)
		{
		case "um": 	 	System.out.println("Janeiro");		 break;
		case "dois": 	System.out.println("Fevereiro");	 break;
		case "tres": 	System.out.println("Mar�o");		 break;
		case "quatro": 	System.out.println("Abril");		 break;
		case "cinco": 	System.out.println("Maio");			 break;
		case "seis": 	System.out.println("JUnho");		 break;
		case "sete": 	System.out.println("Julho");		 break;
		case "oito": 	System.out.println("Agosto");		 break;
		case "nove": 	System.out.println("Setembro");		 break;
		case "dez": 	System.out.println("Outubro");		 break;
		case "onze": 	System.out.println("Novembro");	 	 break;
		case "doze": 	System.out.println("Dezembro");	 	 break;
		default:		System.out.println("M�s inv�lido");  break;
		}
		
		System.out.println();
	}

}
