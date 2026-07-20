package programa;

import java.util.HashMap;
import java.util.Map;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos HashMap
		HashMap<String, Integer> produtos = new HashMap<>(Map.of(
				"pendrive", 20, "ssd", 200, "mouse", 30, "teclado", 40, "cpu", 120));		
		
		System.out.println(produtos);
		
		produtos.put("pvideo", 100);
				
		System.out.println(produtos);
		
		produtos.computeIfAbsent("webcam", (k) -> 40);
		
		System.out.println(produtos);
		
		
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
{mouse=30, cpu=120, teclado=40, pendrive=20, ssd=200}
{mouse=30, cpu=120, teclado=40, pendrive=20, ssd=200, pvideo=100}
{mouse=30, cpu=120, teclado=40, webcam=40, pendrive=20, ssd=200, pvideo=100}
--------------------------
tempo execução em ms: 8



*/
