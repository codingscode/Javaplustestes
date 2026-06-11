package programa;

import java.util.ArrayList;
import java.util.Iterator;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// cria um ArrayList de Strings
	    ArrayList<String> carros = new ArrayList<String>();
	    carros.add("celta");
	    carros.add("scudo");
	    carros.add("l200");
	    carros.add("creta");

	    // Get an iterator for the ArrayList
	    Iterator<String> it = carros.iterator();

	    // Iterate through the list using the iterator
	    while(it.hasNext()) {
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
celta
scudo
l200
creta
--------------------------
tempo execução em ms:
0







*/
