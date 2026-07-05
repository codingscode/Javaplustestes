package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // arrays
		// 
		String[] carros = {"Volvo", "BMW", "Tesla"};
		String[] carros2 = {"Volvo", "BMW", "Tesla"};
		String[] carros3 = {"BMW", "Tesla", "Volvo"};

		System.out.println(Arrays.compare(carros, carros2)); // iguais
		System.out.println(Arrays.compare(carros, carros3)); // diferentes
		
		
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
