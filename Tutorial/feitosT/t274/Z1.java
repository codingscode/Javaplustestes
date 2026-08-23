package programa;

import java.util.HashMap;
import java.util.Map;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		HashMap<String, Integer> produtos = new HashMap<>(Map.of(
				"pendrive", 20, "ssd", 200, "mouse", 30, "teclado", 40, "cpu", 120));
		
		// Usando entrySet para percorrer o mapa
		for (Map.Entry<String, Integer> entrada : produtos.entrySet()) {
			System.out.print(entrada.getKey());
			System.out.print(": ");
		    System.out.println(entrada.getValue());
		}
		
		
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
mouse: 30
cpu: 120
teclado: 40
ssd: 200
pendrive: 20
--------------------------
tempo execução em ms: 0







*/
