package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // arrays metodos
		//
		
		int[][] l1 = {{1, 2}, {3, 4}};
		int[][] l2 = {{1, 2}, {3, 4}};
		int[][] l3 = {{2, 3}, {1, 4}};
		int[][] l4 = {{3, 4}, {1, 2}};
		
		System.out.println(Arrays.deepEquals(l1, l2));
		System.out.println(Arrays.deepEquals(l1, l3));
		System.out.println(Arrays.deepEquals(l1, l4));
		
		
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
0
20
--------------------------
tempo execução em ms: 0






*/
