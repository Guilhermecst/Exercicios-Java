package br.com.cap4;

import java.util.Scanner;

/*
 * O programa a seguir pedir� como entrada um valor num�rico do tipo inteiro que esteja 
 * entre 1 e 12. em seguida, o programa deve apresentar o nome do m�s correspondente ao 
 * valor informado. Caso seja informado um valor de um m�s inexistente, o programa deve
 * avisar ao usu�rio o erro cometido. 
 */

public class C04EX10 {

	public static void main(String args[]) {
		
		int MES;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite um valor referente � um m�s: ");
		MES = s.nextInt();
		
		System.out.println();
		
		if (MES == 1)
			System.out.println("Janeiro");
		else
			if (MES == 2)
				System.out.println("Fevereiro");
			else
				if (MES == 3)
					System.out.println("Mar�o");
				else
					if (MES == 4)
						System.out.println("Abril");
					else
						if (MES == 5)
							System.out.println("Maio");
						else
							if (MES == 6)
								System.out.println("Junho");
							else
								if (MES == 7)
									System.out.println("Julho");
								else
									if (MES == 8)
										System.out.println("Agosto");
									else
										if (MES == 9)
											System.out.println("Setembro");
										else
											if (MES == 10)
												System.out.println("Outubro");
											else
												if (MES == 11)
													System.out.println("Novembro");
												else
													if (MES == 6)
														System.out.println("Dezembro");
													else
														System.out.println("M�s inv�lido");
		
		System.out.println();
	}

}
