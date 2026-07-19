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
		
		HashMap<String, Integer> copia = (HashMap<String, Integer>) produtos.clone();
				
		System.out.println(copia);
		
		copia.remove("mouse");
		
		System.out.println(copia);
		
		System.out.println(produtos);
		
		produtos.clear();
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
{cpu=120, mouse=30, teclado=40, pendrive=20, ssd=200}
{cpu=120, mouse=30, teclado=40, pendrive=20, ssd=200}
{cpu=120, teclado=40, pendrive=20, ssd=200}
{cpu=120, mouse=30, teclado=40, pendrive=20, ssd=200}
{}
--------------------------
tempo execução em ms: 0



*/
