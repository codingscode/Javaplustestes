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
		
		ArrayList<String> frutas = new ArrayList<>(List.of("laranja", "uva", "laranja", "laranja", "maca", "graviola"));
		
		System.out.println(frutas);
		
		// frequencia laranja
        int cont = Collections.frequency(frutas, "laranja");
        
		System.out.println(cont);
		
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
[laranja, uva, laranja, laranja, maca, graviola]
3
--------------------------
tempo execução em ms: 0


*/
