package programa;

import java.util.TreeSet;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// TreeSet -> ordena o conjunto
		// contains(), remove(), clear(), size()
		TreeSet<String> carros = new TreeSet<>();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("BMW");  // Duplicate
		carros.add("Mazda");
		carros.add("corolla");

	    System.out.println(carros);
	    System.out.println(carros.size());
	    
	    System.out.println(carros.contains("Ford"));
	    carros.remove("Ford");
	    
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
[BMW, Ford, Mazda, Volvo, corolla]
5
true
[BMW, Mazda, Volvo, corolla]
[]
--------------------------
tempo execução em ms:
0










*/
