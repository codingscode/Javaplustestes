package programa;

import java.util.ArrayList;
import java.util.Collections;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// interface List
       
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(33);
		numeros.add(15);
		numeros.add(20);
		numeros.add(34);
		numeros.add(8);
		numeros.add(12);

	    Collections.sort(numeros);  // Sort numeros
		
	    System.out.println(numeros);
				
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
[8, 12, 15, 20, 33, 34]
--------------------------
tempo execução em ms:
0









*/
