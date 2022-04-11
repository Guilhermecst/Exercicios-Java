package br.com.cap5;

/*
 * É possível definir datas específicas para fazer essas mesmas ações a 
 * partir do método of() associado a uma das classes já apresentadas.
 */

import java.time.*;

public class C05EX33 {

	public static void main(String[] args) {
		
		LocalDate DATA = LocalDate.of(2001, 11, 24);		// Data especificada
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
