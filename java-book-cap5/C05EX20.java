package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a convers�o de um valor num�rico do tipo byte (concei-
 * to matem�tico) em valor num�rico (conceito alfanum�rico) do String. No exemplo 
 * apresentado, o valor inteiro 10 � mostrado como uma sequ�ncia de caracteres "10".
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