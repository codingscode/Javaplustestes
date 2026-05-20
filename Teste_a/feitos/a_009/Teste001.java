package Programa;

import java.util.Arrays;

public class Teste001 {
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int vetor1[] = {5, 6, 7, 8};
		int vetor2[] = {2, 3, 10};
		
		System.out.println(Arrays.toString(vetor1));
		System.out.println(Arrays.toString(vetor2));
		
		int[] vetor3 = new int[vetor1.length + vetor2.length];

		System.arraycopy(vetor1, 0, vetor3, 0, vetor1.length);
		System.arraycopy(vetor2, 0, vetor3, vetor1.length, vetor2.length);

		System.out.println(Arrays.toString(vetor3)); 

		System.out.println("--------------------------");
		
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		//milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}
	

}

/*
criar código que some dois vetores

[5, 6, 7, 8]
[2, 3, 10]
[5, 6, 7, 8, 2, 3, 10]
--------------------------
--------------------------
tempo execução em ms:
0


*/
;