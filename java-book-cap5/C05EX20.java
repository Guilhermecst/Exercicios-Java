package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um valor numérico do tipo byte (concei-
 * to matemático) em valor numérico (conceito alfanumérico) do String. No exemplo 
 * apresentado, o valor inteiro 10 é mostrado como uma sequência de caracteres "10".
 */

public class C05EX20 {

	public static void main(String[] args) {
		
		byte CURTO = 10;
		String STR;
		
		STR = Byte.toString(CURTO);
		
		System.out.println("Valor = " + STR);
		
	}

}

// byte para String