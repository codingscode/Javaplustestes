package programa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<Integer> numeros = new ArrayList<>(List.of(3,4,5,6,7));
		
	    // Get the iterator
	    Iterator<Integer> it = numeros.iterator();
	    
	    // Loop through a collection
	    while (it.hasNext()) {
	       System.out.println(it.next());
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
3
4
5
6
7
--------------------------
tempo execução em ms: 0






*/
