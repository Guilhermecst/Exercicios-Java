package br.com.cap5;

/*
 * O programa a seguir solicita a data e a hora de uma entrada e também 
 * da saída de um estacionamento, solicita ainda o valor da hora e 
 * apresenta o cálculo do valor a ser pago.
 */

import java.time.*;
import java.time.temporal.*;
import java .text.*;
import java.util.Scanner;

public class C05EX38 {

	public static void main(String[] args) {
		
		LocalDateTime DATA1;
		LocalDateTime DATA2;
		
		int DIA1, MES1, ANO1, HOR1, MIN1;
		int DIA2, MES2, ANO2, HOR2, MIN2;
		
		double VLRHR, FRACAO, VLRTOT;
		
		String EDATA1, EHORA1;
		String EDATA2, EHORA2;
		
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.println();
		System.out.println("-----Estacionamento 24H-----");
		System.out.println();
		System.out.println();
		
		System.out.print("Digite a data de entrada [DD/MM/AAA]: ");
		EDATA1 = s.nextLine();
		
		System.out.print("Digite a hora de entrada [HH:MM]: ");
		EHORA1 = s.nextLine();
		
		System.out.print("Digite a data de saída [DD/MM/AAA]: ");
		EDATA2 = s.nextLine();
		
		System.out.print("Digite a hora de saída [HH:MM]: ");
		EHORA2 = s.nextLine();
		
		System.out.print("Digite o valor da hora: R$ ");
		VLRHR = s.nextDouble();
		
		s.close();
		
		System.out.println();
		
		DIA1 = Integer.parseInt(EDATA1.substring(0, 2));
		MES1 = Integer.parseInt(EDATA1.substring(3, 5)) -1;
		ANO1 = Integer.parseInt(EDATA1.substring(6, 10));
		HOR1 = Integer.parseInt(EHORA1.substring(0, 2));
		MIN1 = Integer.parseInt(EHORA1.substring(3, 5));
		
		DATA1 = LocalDateTime.of(ANO1, MES1, DIA1, HOR1, MIN1);
		
		DIA2 = Integer.parseInt(EDATA2.substring(0, 2));
		MES2 = Integer.parseInt(EDATA2.substring(3, 5)) -1;
		ANO2 = Integer.parseInt(EDATA2.substring(6, 10));
		HOR2 = Integer.parseInt(EHORA2.substring(0, 2));
		MIN2 = Integer.parseInt(EHORA2.substring(3, 5));
		
		DATA2 = LocalDateTime.of(ANO2, MES2, DIA2, HOR2, MIN2);
		
		FRACAO = VLRHR / 60;
		
		if (DATA1.compareTo(DATA2) > 0)
			VLRTOT = ChronoUnit.SECONDS.between(DATA2, DATA1) / 60 * FRACAO;
		else
			VLRTOT = ChronoUnit.SECONDS.between(DATA1, DATA2) / 60 * FRACAO;
		
		df.applyPattern("0.00");
		System.out.println("Valor a ser pago: " + df.format(VLRTOT));
		
	}

}
