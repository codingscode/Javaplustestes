package programa;

import java.util.LinkedHashSet;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// LinkedHashSet -> mantem ordem de inserção
		LinkedHashSet<String> cars = new LinkedHashSet<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");  // Duplicate
	    cars.add("Mazda");

	    System.out.println(cars);
	    

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
[Volvo, BMW, Ford, Mazda]
--------------------------
tempo execução em ms:
0











*/
