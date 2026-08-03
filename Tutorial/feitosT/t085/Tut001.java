package programa;

import java.util.ArrayList;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("celta");
		carros.add("fusca");
		carros.add("scudo");
		carros.add("l200");
	    
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
[celta, fusca, scudo, l200]
--------------------------
tempo execução em ms:
0


*/
