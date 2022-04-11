package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um valor numérico do tipo int (concei-
 * to matemático) em valor numérico (conceito alfanumérico) do String. No exemplo 
 * apresentado, o valor inteiro 10 é mostrado como uma sequência de caracteres "10".
 */

public class C05EX21 {

	public static void main(String[] args) {
		
		int INTEIRO = 10;
		String STR;
		
		STR = Integer.toString(INTEIRO);
		
		System.out.println("Valor = " + STR);

	}

}

// integer para String