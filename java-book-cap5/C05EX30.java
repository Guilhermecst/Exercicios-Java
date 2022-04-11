package br.com.cap5;

import java.time.*;

/*
 * O programa a seguir apresenta um relat�rio com informa��es sobre a data atual do 
 * sistema em uso.
 */

public class C05EX30 {

	public static void main(String[] args) {
		
		LocalDate 	DATA 	= LocalDate.now();			// Data do sistema
		DayOfWeek 	DDS 	= DATA.getDayOfWeek();		// Dia da semana
		int 	  	DDM		= DATA.getDayOfMonth();		// Dia do m�s
		Month 		MES		= DATA.getMonth();			// M�s do ano
		int			NDM		= DATA.getMonthValue();		// N�mero do m�s
		int			ANO 	= DATA.getYear();			// Ano
		int			NDA 	= DATA.getDayOfYear();		// N�mero de dias no ano
		
		System.out.println();
		
		System.out.println("Data do sistema: " + DATA);
		System.out.println("Dia da semana: " + DDS);
		System.out.println("Dia do m�s: " + DDM);
		System.out.println("M�s do ano: " + MES);
		System.out.println("N�mero do m�s: " + NDM);
		System.out.println("Ano: " + ANO);
		System.out.println("N�mero de dias no ano: " + NDA);
		
		System.out.println();
	}

}
