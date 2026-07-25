package programa;

import java.util.HashMap;
import java.util.Map;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos HashMap
		// 
		HashMap<String, Integer> produtos = new HashMap<>(Map.of(
				"pendrive", 20, "ssd", 200, "mouse", 30, "teclado", 40, "cpu", 120));		
		
		
		System.out.println(produtos);
		
		produtos.replace("ssd", 180);
		produtos.replace("teclado", 50);
		produtos.replace("pendrive", 15, 24); // so faz se o segundo bater
				
		System.out.println(produtos);
		
		produtos.replaceAll((c,v) -> v + 5); // chave e valor
		
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
{mouse=30, cpu=120, teclado=50, pendrive=20, ssd=180}
{mouse=35, cpu=125, teclado=55, pendrive=25, ssd=185}
--------------------------
tempo execução em ms: 8



*/
