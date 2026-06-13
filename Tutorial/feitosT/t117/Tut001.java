package programa;

import java.util.ArrayList;
import java.util.Iterator;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(8);
		numeros.add(2);
		numeros.add(23);
		
		System.out.println(numeros);
	    
	    Iterator<Integer> it = numeros.iterator();
	    
	    while(it.hasNext()) {
	       Integer i = it.next();
	       if(i < 10) {
	          it.remove();
	       }
	    }
	    
	    System.out.println(numeros);
	  
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
[12, 8, 2, 23]
[12, 23]
--------------------------
tempo execução em ms:
0













*/
