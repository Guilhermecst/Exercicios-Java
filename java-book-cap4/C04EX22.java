package br.com.cap4;


/*
 * O programa a seguir � uma vers�o do programa C04EX18.java, por�m dessa vez utilizaremos
 * a intru��o do... while.
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
			System.out.println("Tecle: [1] para SIM / [2] para N�O: ");
			System.out.println();	
		
		}
		
		while (RESP == 1);

	}

}