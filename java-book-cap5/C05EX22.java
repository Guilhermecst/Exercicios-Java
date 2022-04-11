package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um valor numérico do tipo long (concei-
 * to matemático) em valor numérico (conceito alfanumérico) do String. No exemplo 
 * apresentado, o valor inteiro 10 é mostrado como uma sequência de caracteres "10".
 */

public class C05EX22 {

	public static void main(String[] args) {
		
		long LONGO = 10;
		String STR;
		
		STR = Long.toString(LONGO);
		
		System.out.println("Valor = " + STR);

	}
}

// long para String