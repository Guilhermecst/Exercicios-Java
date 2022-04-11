package br.com.cap5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/*
 * O m�todo of() pode ter seus argumentos fornecidos de uma maneira diferente
 * quando o uso da enumera��o Month associada � constante que representa o 
 * m�s.
 */

public class C05EX34 {

	public static void main(String[] args) {

				
		LocalDate DATA = LocalDate.of(2001, Month.NOVEMBER, 24);		// Data especificada
		DayOfWeek DDS1 = DATA.getDayOfWeek();
		int 	  DDS2 = DDS1.getValue();
		Month	  MES  = DATA.getMonth();
		int		  NMES = MES.getValue();
		int 	  NDA  = DATA.getDayOfYear();
				
		System.out.println();
		System.out.println("Data especificada: " + DATA);
		System.out.println("Dia das semana (extenso): " + DDS1);
		System.out.println("Dia da semana (n�mero): " + DDS2);
		System.out.println("M�s (extenso): " + MES);
		System.out.println("M�s (n�mero): " + NMES);
		System.out.println("N�mero de dias no ano: " + NDA);
		System.out.println();

	}

}
