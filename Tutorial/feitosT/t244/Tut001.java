package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<String> nomes = new ArrayList<>(List.of("mel", "aladim", "apolo", "lily"));
		
		System.out.println(nomes.size()); // quantidade elementos
		
		nomes.sort( (a, b) -> { return -1 * a.compareTo(b); } ); // reverso
		        
        System.out.println(nomes);


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

4
[mel, lily, apolo, aladim]
--------------------------
tempo execução em ms: 9



*/
