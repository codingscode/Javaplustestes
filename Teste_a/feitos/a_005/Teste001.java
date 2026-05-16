package Programa;

import java.util.Arrays;

public class Teste001 {
	


	public static void main(String[] args) {
		long startTime = System.nanoTime();

		String s1 = "programa";
		String s2 = " legal";
		String s3 = s1 + s2;
		
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		
				
		System.out.println("--------------------------");

		System.out.println("tamanho do string: " + s3.length());
		System.out.println("--------------------------");
		
		String sequencia = "pcubtwe";
		System.out.println("sequencia: " + sequencia);
		
		
		char[] arrayCaract = sequencia.toCharArray();
		Arrays.sort(arrayCaract);
		String ordenado = new String(arrayCaract);
		System.out.println("ordenado: " + ordenado);
		
		System.out.println("--------------------------");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");

	}
	

}

/*
s1: programa
s2:  legal
s3: programa legal
--------------------------
tamanho do string: 14
--------------------------
sequencia: pcubtwe
ordenado: bceptuw
--------------------------
PROGRAMA
programa
--------------------------
Execution time: 25 ms



*/
;