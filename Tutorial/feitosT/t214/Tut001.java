package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // arrays metodos
		// 
		String[] carros = {"fusca", "celta", "kombi", "creta", "l200"};
		String[] carros2 = Arrays.copyOf(carros, 3); // até o indice 2
		
		System.out.println(Arrays.toString(carros2));
		
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
[fusca, celta, kombi]
--------------------------
tempo execução em ms: 0






*/
