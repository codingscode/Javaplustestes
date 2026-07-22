package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		ArrayList<Integer> numeros1 = new ArrayList<>(List.of(12, 5, 10, 3, 8, 4));
		ArrayList<Integer> numeros2 = new ArrayList<>(numeros1);
				
		System.out.println(numeros1);
		
		numeros2.set(0, 32);
		
		System.out.println(numeros2);
		
		System.out.println(numeros1);
		
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
[32, 5, 10, 3, 8, 4]
[12, 5, 10, 3, 8, 4]
--------------------------
tempo execução em ms: 0




*/
