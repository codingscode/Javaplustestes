package programa;

import java.util.HashSet;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// HashSet nao aceita repetição
		HashSet<String> carros = new HashSet<String>();
		carros.add("celta");
		carros.add("fusca");
		carros.add("scudo");
		carros.add("celta"); // duplicado
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
[scudo, celta, fusca, l200]
--------------------------
tempo execução em ms:
0





*/
