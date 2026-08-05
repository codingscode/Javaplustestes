package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// interface List
        // LinkedList usado para manipular dados
		// metodos usados: addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast() 
		List<String> carros = new LinkedList<String>();
		
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		
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
[Volvo, BMW, Ford, Mazda]
--------------------------
tempo execução em ms:
1







*/
