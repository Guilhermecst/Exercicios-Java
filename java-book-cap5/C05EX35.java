package br.com.cap5;

import java.time.Year;

/*
 * O exemplo a seguir retorna um boolean se o ano for bissexto
 */

public class C05EX35 {

	public static void main(String[] args) {
		
		Year ANO1 = Year.of(2016);
		boolean BIS1 = ANO1.isLeap();
		
		if (BIS1 == true) {
			System.out.println(ANO1 + " é um ano bissexto");
		}
		else {
			System.out.println(ANO1 + " não é um ano bissexto");
		}
		
		Year ANO2 = Year.of(2018);
		boolean BIS2 = ANO2.isLeap();
		
		if (BIS2 == true) {
			System.out.println(ANO2 + " é um ano bissexto");
		}
		else {
			System.out.println(ANO2 + " não é um ano bissexto");
		}

	}

}
