package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a conversão de um dado do tipo inteiro (int) para o seu
 * equivalente em lógico (boolean). Será considerado nesse exemplo um valor lógico verda-
 * deiro quando o valor inteiro correspondente for diferente de zero.
 */

public class C05EX29 {

	public static void main(String[] args) {
		
		int INTEIRO = 0;
		boolean LOGICO;
		
		LOGICO = INTEIRO != 0;
		
		System.out.println("Valor verdadeiro de INTEIRO" + INTEIRO);
		System.out.println("Valor verdadeiro de LOGICO" + LOGICO);

	}

}

// integer para boolean