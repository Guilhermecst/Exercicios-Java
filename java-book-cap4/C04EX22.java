package br.com.cap4;


/*
 * O programa a seguir é uma versão do programa C04EX18.java, porém dessa vez utilizaremos
 * a intrução do... while.
 */

public class C04EX22 {

	public static void main(String args[]) {
		
		int I, RESP = 1;
		
		do
		{
			
			System.out.println();
			
			I = 1;
			
			do 
			{
				
				System.out.println("Valor = " + I);
				I++;
				
			}
			while (I <= 5);
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.println("Tecle: [1] para SIM / [2] para NÃO: ");
			System.out.println();	
		
		}
		
		while (RESP == 1);

	}

}