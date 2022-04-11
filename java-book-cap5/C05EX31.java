package br.com.cap5;

import java.time.*;

/*
* O programa a seguir apresenta um relatório com informações sobre o horário atual do 
* sistema em uso.
*/

public class C05EX31 {

	public static void main(String[] args) {
		
		LocalTime 	HORA = LocalTime.now();		// Hora do sistema
		int 		HOR  = HORA.getHour();		// Pega apenas a hora
		int 		MIN  = HORA.getMinute();	// Pega apenas o minuto
		int 		SEG  = HORA.getSecond();	// Pega apenas o segundo
		
		System.out.println();
		
		System.out.println("Hora do sistema: " + HORA);
		System.out.println("Hora: " + HOR);
		System.out.println("Minutos: " + MIN);
		System.out.println("Segundos " + SEG);
		
		System.out.println();	
	}

}
