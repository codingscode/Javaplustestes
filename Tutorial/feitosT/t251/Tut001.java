package programa;

import java.util.LinkedList;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList
		LinkedList<String> carros = new LinkedList<String>();
		
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		
	    System.out.println(carros);
		        
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
[Volvo, BMW, Ford, Mazda]
--------------------------
tempo execução em ms: 1







*/
