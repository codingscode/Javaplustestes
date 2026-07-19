package programa;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		LinkedList<String> carros = new LinkedList<String>(List.of("celta", "fusca", "l200", "pajero"));
				
		 // Get the iterator
	    ListIterator<String> it = carros.listIterator();
	    
	    // Loop through the list
	    while(it.hasNext()) {
	      System.out.println(it.next());
	    }
	    
	    System.out.println("---");
	    
	    // Loop backwards through the list
	    while(it.hasPrevious()) {
	      System.out.println(it.previous());
	    }
		
        
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
celta
fusca
l200
pajero
---
pajero
l200
fusca
celta
--------------------------
tempo execução em ms: 1




*/
