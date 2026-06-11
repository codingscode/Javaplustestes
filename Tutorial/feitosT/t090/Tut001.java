package programa;

import java.util.ArrayList;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// interface List
		// metodo add() para adicionar
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add(0, "Mazda"); // insere elemento no index 0 da lista
		
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
[Mazda, Volvo, BMW, Ford]
--------------------------
tempo execução em ms:
0










*/
