package Programa;

import java.util.Arrays;

public class Teste001 {
	


	public static void main(String[] args) {
		long startTime = System.nanoTime();
				
		int lista[] = {5, 3, 2, 8, 1, 7, 4, 11, 12, 14};
		
		System.out.println(Arrays.toString(lista));
				
		System.out.println("--------------------------");

		System.out.println("tamanho lista: " + lista.length);
		System.out.println("--------------------------");
		
		int v1 = 3;
		int v2 = v1;
		
		v1 = 5;
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		
		
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");

	}
	

}

/*
[5, 3, 2, 8, 1, 7, 4, 11, 12, 14]
--------------------------
tamanho lista: 10
--------------------------
v1: 5
v2: 3
Execution time: 14 ms






*/
