package programa;

import java.util.ArrayList;
import java.util.Iterator;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Make a collection
	    ArrayList<String> carros = new ArrayList<String>();
	    
	    carros.add("Volvo");
	    carros.add("BMW");
	    carros.add("Ford");
	    carros.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = carros.iterator();

	    while (it.hasNext()) { // enquanto houver próximo
    	   System.out.println(it.next());
    	}

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
Volvo
BMW
Ford
Mazda
--------------------------
tempo execução em ms:
0












*/
