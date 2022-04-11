package br.com.cap5;

import java.time.*;

/*
* O programa a seguir apresenta um relatório com informações sobre a data e horário atual 
* do sistema em uso.
*/

public class C05EX32 {

	public static void main(String[] args) {

		LocalDateTime 	DTHR = LocalDateTime.now();
		int 			HOR  = DTHR.getHour();		
		int 			MIN  = DTHR.getMinute();	
		int 			SEG  = DTHR.getSecond();
		int 			NAS  = DTHR.getNano(); 			// Pega o nanosegundo
		
		System.out.println();
		
		System.out.println("Data e hora do sistema: " + DTHR);
		System.out.println("Hora: " + HOR);
		System.out.println("Minutos: " + MIN);
		System.out.println("Segundos " + SEG);
		System.out.println("Nanosegundos: " + NAS);
		
		System.out.println();

	}

}
