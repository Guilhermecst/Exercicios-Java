package exerc3.cap4;

/*
 * Apresentar todos os números ímpares situados na faixa de 0 a 20.
 */

public class EXERC04EX3C {

	public static void main(String[] args) {
		 
		int num = 0;
		
		System.out.println();
		
		while (num <= 20) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
			num++;
		}

	}

}
