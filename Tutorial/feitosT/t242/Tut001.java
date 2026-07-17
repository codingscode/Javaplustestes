package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<Integer> numeros = new ArrayList<>(List.of(3,4,5,6,7));
		
		System.out.println(numeros);
		
		numeros.set(0, 50); // no indice 0 coloca 50
		
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
[3, 4, 5, 6, 7]
[50, 4, 5, 6, 7]
--------------------------
tempo execução em ms: 0



*/
