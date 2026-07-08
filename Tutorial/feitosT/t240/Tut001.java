package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<Integer> numeros1 = new ArrayList<>(List.of(3,4,5,6,7));
		
		ArrayList<Integer> numeros2 = new ArrayList<>(List.of(2,4,5,8,9));
		
		System.out.println(numeros1);
		System.out.println(numeros2);
		
		numeros1.retainAll(numeros2);
                
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
[3, 4, 5, 6, 7]
[2, 4, 5, 8, 9]
[4, 5]
--------------------------
tempo execução em ms: 0



*/
