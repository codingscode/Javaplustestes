package programa;

import java.util.ArrayList;
import java.util.Collections;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// interface List

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// equivalente -> var numeros = new ArrayList<Integer>(); desde java 10
		numeros.add(10);
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		
		System.out.println(numeros);
		
		Collections.sort(numeros);
		
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
[10, 5, 7, 8]
[5, 7, 8, 10]
--------------------------
tempo execução em ms:
0



*/
