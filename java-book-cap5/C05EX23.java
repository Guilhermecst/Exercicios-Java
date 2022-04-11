package br.com.cap5;

/*
 * O exemplo a seguir demonstra a conversão de um valor numérico definido como sequência
 * de caracteres do tipo String como valor numérico do tipo double. No exemplo apresentado,
 * o valor "10.89" será mostrado como 10.89.
 */

public class C05EX23 {

	public static void main(String[] args) {
		
		String STR = "10.89";
		double VALOR;
		
		VALOR = Double.valueOf(STR).doubleValue();
		
		System.out.println("Valor = " + VALOR);
		
	}
	
}

// String para double