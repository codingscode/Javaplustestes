package Programa;

import java.util.ArrayList;
import java.util.List;

public class Teste001 {
	
	public static List<Integer> divisores(int n){
		List<Integer> divs = new ArrayList<>();
		
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				divs.add(i);
			}
		}
		divs.add(n);
		return divs;
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int numero1 = 20;
		System.out.println(numero1);
		System.out.println(divisores(numero1));
				
		int numero2 = 28;
		System.out.println(numero2);
		System.out.println(divisores(numero2));
		
		int numero3 = 37;
		System.out.println(numero3);
		System.out.println(divisores(numero3));
		
		
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");

	}
	

}

/*
cód. mostrar lista de divisores de um número

20
[1, 2, 4, 5, 10, 20]
28
[1, 2, 4, 7, 14, 28]
37
[1, 37]
--------------------------
Execution time: 0 ms



*/
;