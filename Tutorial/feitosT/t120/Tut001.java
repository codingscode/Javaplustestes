package programa;

import java.util.ArrayList;
import java.util.Collections;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// algoritmos
		// embaralhar
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(8);
		numeros.add(5);
		numeros.add(3);
		numeros.add(9);
		numeros.add(7);
		
		Collections.shuffle(numeros);
		
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
[8, 3, 5, 9, 7]
--------------------------
tempo execução em ms:
0
















*/
