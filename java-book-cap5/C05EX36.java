package br.com.cap5;

/*
 * O programa a seguir calcula a diferença de dias entre duas datas.
 */

import java.time.*;
import java.time.temporal.*;
import java.util.Scanner;

public class C05EX36 {

	public static void main(String[] args) {
		
		LocalDate DATA1;
		LocalDate DATA2;
		
		int DIA1, MES1, ANO1; 
		int DIA2, MES2, ANO2;
		long DIFERENCA;
		
		String EDATA1;
		String EDATA2;
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite a 1ª data no formato DD/MM/AAAA: ");
		EDATA1 = s.nextLine();
		
		System.out.println();
		
		System.out.print("Digite a 2ª data no formato DD/MM/AAAA: ");
		EDATA2 = s.nextLine();
		
		s.close();
		
		System.out.println();
		
		DIA1 = Integer.parseInt(EDATA1.substring(0, 2));
		MES1 = Integer.parseInt(EDATA1.substring(3, 5)) -1;
		ANO1 = Integer.parseInt(EDATA1.substring(6, 10));
		
		DATA1 = LocalDate.of(ANO1, MES1, DIA1);
		
		DIA2 = Integer.parseInt(EDATA2.substring(0, 2));
		MES2 = Integer.parseInt(EDATA2.substring(3, 5)) -1;
		ANO2 = Integer.parseInt(EDATA2.substring(6, 10));
		
		DATA2 = LocalDate.of(ANO2, MES2, DIA2);
		
		if (DATA1.compareTo(DATA2) > 0)
			DIFERENCA = ChronoUnit.DAYS.between(DATA2, DATA1);
		else
			DIFERENCA = ChronoUnit.DAYS.between(DATA1, DATA2);
		
		System.out.println("Diferença de dias entre " + DATA1 + " e " + DATA2 + " = " + DIFERENCA + " dias");
	}

}
