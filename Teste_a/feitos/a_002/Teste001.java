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
	
	public static void e_primo(int[] ls) {
		for (int cada : ls) {
			int div = 0;
			for (int i=1; i<=cada/2;i++) {
				
				if (cada > 1 && cada % i == 0) {
					div += 1;
				}
			}
			if (div < 2 && cada > 1) {
				System.out.println(cada + " é primo");
			}
		}
	}


	public static void main(String[] args) {
		long startTime = System.nanoTime();
				
		int lista[] = {5, 3, 2, 8, 1, 7, 4, 11, 12, 14};
		
		System.out.println(Arrays.toString(lista));
				
		System.out.println("--------------------------");
				
		
		System.out.println("pares: ");
		pares(lista);
		
		System.out.println("impares: ");
		impares(lista);
				
		e_primo(lista);

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");

	}
	

}

/*
código que mostra pares, impares e primos de uma sequencia de inteiros


[5, 3, 2, 8, 1, 7, 4, 11, 12, 14]
--------------------------
pares: 
2, 8, 4, 12, 14, 
impares: 
5, 3, 1, 7, 11, 
5 é primo
3 é primo
2 é primo
7 é primo
11 é primo
Execution time: 15 ms



*/
