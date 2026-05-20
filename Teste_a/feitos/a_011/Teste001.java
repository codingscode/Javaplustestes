package Programa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Teste001 {
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 6, 7, 8));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 10));
		
		System.out.println(set1);
		System.out.println(set2);
		
		Set<Integer> set3 = new HashSet(set1);
		set3.addAll(set2);		
		
		System.out.println(set3); 

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
criar código que some dois conjuntos

[5, 6, 7, 8]
[2, 3, 10]
[2, 3, 5, 6, 7, 8, 10]
--------------------------
--------------------------
tempo execução em ms:
0




*/
;