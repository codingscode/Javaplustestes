package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<String> nomes = new ArrayList<>(List.of("mel", "aladim", "apolo", "lily"));
		
		// Get the spliterator and split it
	    Spliterator<String> it1 = nomes.spliterator();
	    Spliterator<String> it2 = it1.trySplit();
	    
	    // Loop through the first spliterator
	    System.out.println("primeiro spliterator");
	    
	    while( it1.tryAdvance( (n) -> { System.out.println(n); } ) );
	    
	    // Loop through the second spliterator
	    System.out.println("\nsegundo spliterator");
	    
	    while( it2.tryAdvance( (n) -> { System.out.println(n); } ) );


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
primeiro spliterator
apolo
lily

segundo spliterator
mel
aladim
--------------------------
tempo execução em ms: 9



*/
