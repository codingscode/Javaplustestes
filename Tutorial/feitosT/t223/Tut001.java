package programa;

import java.util.ArrayList;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
	    
	    ArrayList<String> marcas = new ArrayList<String>();
	    marcas.add("Microsoft");
	    marcas.add("W3Schools");
	    marcas.add("Apple");
	    
	    marcas.addAll(carros);
	    
	    System.out.println(marcas);
		
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
[Microsoft, W3Schools, Apple, Volvo, BMW, Ford, Mazda]
--------------------------
tempo execução em ms: 0






*/
