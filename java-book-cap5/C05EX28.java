package br.com.cap5;

/* 
 * O exemplo a seguir demonstra a convers�o de um dado do tipo l�gico (boolean) para o seu
 * equivalente em inteiro (int). Ao se definir um valor l�gico, o programa retornar� seu 
 * resultado como inteiron. Nesse caso, o programa retorna 1 (um) se a condi��o for verda-
 * deira ou 0 (zero) se a condi��o for falsa. 
 */

public class C05EX28 {

	public static void main(String[] args) {
		
		boolean LOGICO = true;
		int INTEIRO;
		
		INTEIRO = (LOGICO)?1:0;
		
		System.out.println("Valor verdadeiro de LOGICO" + LOGICO);
		System.out.println("Valor verdadeiro de INTEIRO" + INTEIRO);

	}

}

// boolean para integer