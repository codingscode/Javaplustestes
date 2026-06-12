package programa;

import java.util.LinkedHashSet;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// LinkedHashSet -> mantem ordem de inserção
		// contains(), remove(), clear(), size()
		LinkedHashSet<String> carros = new LinkedHashSet<>();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("BMW");  // Duplicate
		carros.add("Mazda");
		carros.add("hilux");

	    System.out.println(carros);
	    
	    System.out.println(carros.size());
	    System.out.println(carros.contains("BMW"));
	    
	    carros.remove("Mazda");
	    System.out.println(carros);
	    
	    carros.clear();
	    System.out.println(carros);
	    

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
[Volvo, BMW, Ford, Mazda, hilux]
5
true
[Volvo, BMW, Ford, hilux]
[]
--------------------------
tempo execução em ms:
0


*/
