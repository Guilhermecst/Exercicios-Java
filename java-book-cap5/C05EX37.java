package br.com.cap5;

/*
 * O programa a seguir apresenta a diferença entre a data fornecida pelo
 * usuário e a data atual.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05EX37 {

	public static void main(String[] args) {

		LocalDate DATA1;
		LocalDate DATA2  = LocalDate.now();
		
		int DIA1, MES1, ANO1;
		long DIFERENCA;
		
		String EDATA1;
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite a 1ª data no formato DD/MM/AAAA: ");
		EDATA1 = s.nextLine();
		
		s.close();
		
		DIA1 = Integer.parseInt(EDATA1.substring(0, 2));
		MES1 = Integer.parseInt(EDATA1.substring(3, 5)) -1;
		ANO1 = Integer.parseInt(EDATA1.substring(6, 10));
		
		DATA1 = LocalDate.of(ANO1, MES1, DIA1);
		
		if (DATA1.compareTo(DATA2) > 0)
			DIFERENCA = ChronoUnit.DAYS.between(DATA2, DATA1);
		else
			DIFERENCA = ChronoUnit.DAYS.between(DATA1, DATA2);
		
		System.out.println("Diferença de dias entre " + DATA1 + " e " + DATA2 + " = " + DIFERENCA + " dias");
		

	}

}
