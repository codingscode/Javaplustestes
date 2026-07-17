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
		
		nomes.sort(null); // ordena alfabeticamente
		
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
[aladim, apolo, lily, mel]
--------------------------
tempo execução em ms: 0



*/
