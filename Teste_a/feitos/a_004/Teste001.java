package Programa;

import java.util.Arrays;

public class Teste001 {
	


	public static void main(String[] args) {
		long startTime = System.nanoTime();
				
		String minhaS = "Muito bom";
		
		System.out.println(minhaS);
				
		System.out.println("--------------------------");

		System.out.println("tamanho do string: " + minhaS.length());
		System.out.println("--------------------------");
		
		String f1 = "laranja";
		String f2 = f1;
		
		f1 = "uva";
		
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");

	}
	

}

/*
Muito bom
--------------------------
tamanho do string: 9
--------------------------
f1: uva
f2: laranja
Execution time: 23 ms






*/
