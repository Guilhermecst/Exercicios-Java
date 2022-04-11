package br.com.cap5;

/*
 * � poss�vel definir datas espec�ficas para fazer essas mesmas a��es a 
 * partir do m�todo of() associado a uma das classes j� apresentadas.
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
		System.out.println("Dia da semana (n�mero): " + DDS2);
		System.out.println("M�s (extenso): " + MES);
		System.out.println("M�s (n�mero): " + NMES);
		System.out.println("N�mero de dias no ano: " + NDA);
		System.out.println();

	}

}
