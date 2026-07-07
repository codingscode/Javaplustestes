package programa;

import java.util.ArrayList;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// clone
		
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("fusca");
		carros.add("celta");
		carros.add("gol");
		carros.add("palio");
	    
	    ArrayList<String> carros2 = (ArrayList<String>) carros.clone();
	    carros2.set(0, "hilux");
	    
	    System.out.println(carros);
	    System.out.println(carros2);
		
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
[fusca, celta, gol, palio]
[hilux, celta, gol, palio]
--------------------------
tempo execução em ms: 0






*/
