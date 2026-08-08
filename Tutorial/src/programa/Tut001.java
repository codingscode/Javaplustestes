package programa;

import java.util.ArrayList;
import java.util.Collections;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
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
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}

}

/*










*/
