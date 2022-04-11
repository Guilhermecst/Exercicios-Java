package br.com.cap5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/*
 * O método of() pode ter seus argumentos fornecidos de uma maneira diferente
 * quando o uso da enumeração Month associada à constante que representa o 
 * mês.
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
		System.out.println("Dia da semana (número): " + DDS2);
		System.out.println("Mês (extenso): " + MES);
		System.out.println("Mês (número): " + NMES);
		System.out.println("Número de dias no ano: " + NDA);
		System.out.println();

	}

}
