package programa;

import java.util.HashSet;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// interface Set
		// metodos -> add(), remove(), contains(), size(), clear()
		HashSet<String> carros = new HashSet<String>();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("BMW");  // duplicar
		carros.add("Mazda");
		
	    for (String cada : carros) {
	    	System.out.println(cada);
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
Mazda
Ford
BMW
--------------------------
tempo execução em ms:
0






*/
