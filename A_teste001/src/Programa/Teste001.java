package Programa;

import java.util.Arrays;

public class Teste001 {
	
	public static void pares(int[] ls) {
		for (int cada : ls) {
			if (cada % 2 == 0) {
				System.out.print(cada + ", ");
			}
		}
		System.out.println("");
	}
	
	public static void impares(int[] ls) {
		for (int cada : ls) {
			if (cada % 2 == 1) {
				System.out.print(cada + ", ");
			}
		}
		System.out.println("");
	}


	public static void main(String[] args) {
		long startTime = System.nanoTime();
				
		int lista[] = {5, 3, 2, 1, 7, 4, 11};
		
		System.out.println(Arrays.toString(lista));
				
		System.out.println("--------------------------");
				
		
		System.out.println("pares: ");
		pares(lista);
		
		System.out.println("impares: ");
		impares(lista);
				

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");
		

	}
	
	
	

}

/*
código que mostra o maior e o menor número de uma sequencia

[5, 3, 2, 1, 7, 4]
5
3
2
1
7
4
--------------------------
o maior é: 7
o menor é: 1
Execution time: 17 ms




*/
