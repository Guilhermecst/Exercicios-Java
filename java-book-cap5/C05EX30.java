package br.com.cap5;

import java.time.*;

/*
 * O programa a seguir apresenta um relatório com informações sobre a data atual do 
 * sistema em uso.
 */

public class C05EX30 {

	public static void main(String[] args) {
		
		LocalDate 	DATA 	= LocalDate.now();			// Data do sistema
		DayOfWeek 	DDS 	= DATA.getDayOfWeek();		// Dia da semana
		int 	  	DDM		= DATA.getDayOfMonth();		// Dia do mês
		Month 		MES		= DATA.getMonth();			// Mês do ano
		int			NDM		= DATA.getMonthValue();		// Número do mês
		int			ANO 	= DATA.getYear();			// Ano
		int			NDA 	= DATA.getDayOfYear();		// Número de dias no ano
		
		System.out.println();
		
		System.out.println("Data do sistema: " + DATA);
		System.out.println("Dia da semana: " + DDS);
		System.out.println("Dia do mês: " + DDM);
		System.out.println("Mês do ano: " + MES);
		System.out.println("Número do mês: " + NDM);
		System.out.println("Ano: " + ANO);
		System.out.println("Número de dias no ano: " + NDA);
		
		System.out.println();
	}

}
