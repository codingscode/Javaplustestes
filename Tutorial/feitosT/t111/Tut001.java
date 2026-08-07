package programa;

import java.util.TreeMap;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Map interface
		// TreeMap -> ordenado pela chave
		// put(), get(), remove(), containsKey(), keySet()
		
		TreeMap<String, Integer> produtos = new TreeMap<>();
		
		produtos.put("camisa", 90);
		produtos.put("bermuda", 50);
		produtos.put("calca", 100);
		produtos.put("sapato", 80);
		produtos.put("calca", 10); // duplicado, se valor diferente sobrescreve
		
		System.out.println(produtos);

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
{bermuda=50, calca=10, camisa=90, sapato=80}
--------------------------
tempo execução em ms:
0









*/
