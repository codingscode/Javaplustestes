package programa;

import java.util.ArrayList;
import java.util.Collections;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// algoritmos
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Liam");
		nomes.add("Jenny");
		nomes.add("Kasper");
		nomes.add("Angie");

	    Collections.sort(nomes); // must be sorted first
	    
	    System.out.println(nomes);
	    
	    int index = Collections.binarySearch(nomes, "Angie");
	    
	    System.out.print("Angie está no indice: ");
	    
	    System.out.println(index);
	    
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
[Angie, Jenny, Kasper, Liam]
Angie está no indice: 0
--------------------------
tempo execução em ms: 0



*/
