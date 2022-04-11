package br.com.cap5;

/*
 * O exemplo a seguir demonstra a extração dos códigos ASCII de uma sequência de caracte-
 * res definida.
 */

public class C05EX17 {

	public static void main(String[] args) {
		
		String STR = "ESTUDO EM JAVA";
		int I, SEQASCII;
		char CARACTERE;
		
		for (I = 0; I < STR.length(); I++) {
			CARACTERE = STR.charAt(I);
			System.out.println(" " + CARACTERE + " ");
		}
		
		System.out.println();
		
		for (I = 0; I < STR.length(); I++) {
			CARACTERE = STR.charAt(I);
			SEQASCII = (int)CARACTERE;
			System.out.println(SEQASCII + " ");
		}

	}

}

// String para código ASCII