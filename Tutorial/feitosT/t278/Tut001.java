package programa;

import java.util.HashMap;
import java.util.Map;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos HashMap
		// merge -> em chave valor, atribui ou cria outro valor a valor e/ou cria outra chave
		HashMap<String, Integer> produtos = new HashMap<>(Map.of(
				"pendrive", 20, "ssd", 200, "mouse", 30, "teclado", 40, "cpu", 120));		
		
		System.out.println(produtos);
		
		produtos.merge("webcam", 23, (c,v) -> v + 10); // nao existe mas cria
		
		System.out.println(produtos);
		
		produtos.merge("mouse", 40, (c,v) -> v - 12); // existe e modifica

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
{mouse=30, cpu=120, teclado=40, ssd=200, pendrive=20}
{mouse=30, cpu=120, teclado=40, webcam=23, ssd=200, pendrive=20}
{mouse=28, cpu=120, teclado=40, webcam=23, ssd=200, pendrive=20}
--------------------------
tempo execução em ms: 9



*/
