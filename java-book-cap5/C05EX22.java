package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a convers�o de um valor num�rico do tipo long (concei-
 * to matem�tico) em valor num�rico (conceito alfanum�rico) do String. No exemplo 
 * apresentado, o valor inteiro 10 � mostrado como uma sequ�ncia de caracteres "10".
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