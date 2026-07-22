package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		ArrayList<Integer> numeros = new ArrayList<>(List.of(12, 5, 10, 3, 8, 4));
		
		System.out.println(numeros);
		
		// Swap element at index 0 ("A") with element at index 2 ("C")
        Collections.swap(numeros, 0, 2);
		
		System.out.println(numeros);
		
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
[10, 5, 12, 3, 8, 4]
--------------------------
tempo execução em ms: 0


*/
