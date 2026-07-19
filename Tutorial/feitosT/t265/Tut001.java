package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		LinkedList<String> carros = new LinkedList<String>(List.of("mercedez", "ferrari", "vectra", "l200", "pajero"));
		
		LinkedList<String> carros2 = new LinkedList<String>(List.of("mercedez", "ferrari", "celta", "fusca", "vectra"));
		
		System.out.println(carros);
		
		carros.retainAll(carros2); // comum
		
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
[mercedez, ferrari, vectra, l200, pajero]
[mercedez, ferrari, vectra]
--------------------------
tempo execução em ms: 1



*/
