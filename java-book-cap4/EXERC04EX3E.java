package exerc3.cap4;

/*
 * Apresentar o resultado somatório de todos os valores pares existentes na faixa numérica
 * de 1 a 50.
 */

public class EXERC04EX3E {

	public static void main(String[] args) {
		
		int soma = 0;
		int i = 1;
		
		System.out.println();
		
		while (i <= 50) {
			if (i % 2 == 0) {
				soma += i;
			}
			i++;
		}
		
		System.out.println(soma);

	}

}
