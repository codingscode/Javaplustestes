package programa;

import java.util.HashMap;
import java.util.Map;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos HashMap
		// .get(chave)
		HashMap<String, Integer> produtos = new HashMap<>(Map.of(
				"pendrive", 20, "ssd", 200, "mouse", 30, "teclado", 40, "cpu", 120));		
		
		System.out.println(produtos);
		
		System.out.println(produtos.isEmpty());
		
		System.out.println(produtos.keySet());
		
		System.out.println( (produtos.keySet()).getClass().getSimpleName() );
		
		
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
{mouse=30, cpu=120, teclado=40, ssd=200, pendrive=20}
false
[mouse, cpu, teclado, ssd, pendrive]
KeySet
--------------------------
tempo execução em ms: 0



*/
