package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a convers�o de um valor num�rico do tipo int (concei-
 * to matem�tico) em valor num�rico (conceito alfanum�rico) do String. No exemplo 
 * apresentado, o valor inteiro 10 � mostrado como uma sequ�ncia de caracteres "10".
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