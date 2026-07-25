package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		ArrayList<Integer> numeros1 = new ArrayList<>(List.of(12, 5, 10, 3, 8, 4));
		
		System.out.println(numeros1);
		
		numeros1.replaceAll(cada -> cada + 1);
		
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
[13, 6, 11, 4, 9, 5]
--------------------------
tempo execução em ms: 8





*/
