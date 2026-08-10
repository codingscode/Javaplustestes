package programa;

import java.util.ArrayList;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Generics
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("jaca");
		
		String fruta = lista.get(0); // nao precisa usar cast 				 
		
		System.out.println(fruta);
		
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
jaca
--------------------------
tempo execução em ms:
0




*/
