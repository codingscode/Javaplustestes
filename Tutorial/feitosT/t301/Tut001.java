package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		ArrayList<Integer> numeros1 = new ArrayList<>(List.of(12, 5, 10, 3, 8, 4));
		ArrayList<Integer> numeros2 = new ArrayList<>(List.of(1,2,6));
		
		System.out.println(numeros1);
		System.out.println(numeros2);
		
		boolean nada_comum = Collections.disjoint(numeros1, numeros2);
		
		System.out.println(nada_comum);
		
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}

}

/*
[12, 5, 10, 3, 8, 4]
[1, 2, 6]
true
--------------------------
tempo execução em ms: 0


*/
