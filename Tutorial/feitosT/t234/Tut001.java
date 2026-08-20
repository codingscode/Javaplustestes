package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<Integer> numeros = new ArrayList<>(List.of(3,4,5,6,4,10));
		
		// Get the iterator
	    ListIterator<Integer> it = numeros.listIterator();
	    
	    // Loop through the list
	    while(it.hasNext()) {
	       System.out.println(it.next());
	    }
	    
	    System.out.println("voltando");
	    
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
3
4
5
6
4
10
voltando
10
4
6
5
4
3
--------------------------
tempo execução em ms: 1






*/
