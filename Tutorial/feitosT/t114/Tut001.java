package programa;

import java.util.LinkedHashMap;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Map interface
		// LinkedHashMap -> mantem ordem em que foram inseridos
		// put(), get(), remove(), containsKey(), keySet()
		// mesma ideia do ultimo
		
		LinkedHashMap<String, Integer> produtos = new LinkedHashMap<>();
		
		produtos.put("camisa", 90);
		produtos.put("bermuda", 50);
		produtos.put("calca", 100);
		produtos.put("sapato", 80);
		produtos.put("calca", 10); // duplicado, se valor diferente sobrescreve
		
		System.out.println(produtos);
		
		// imprime chaves
		for (String chave : produtos.keySet()) {
		   System.out.println(chave);
		}
		
		System.out.println("************************");
		
		// imprime valores
		for (Integer valor : produtos.values()) {
		  System.out.println(valor);
		}
		
		System.out.println("************************");
		
		// imprime chaves e valores
		for (String chave : produtos.keySet()) {
		  System.out.print(chave);
		  System.out.print(": ");
		  System.out.println(produtos.get(chave));
		}

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
{camisa=90, bermuda=50, calca=10, sapato=80}
camisa
bermuda
calca
sapato
************************
90
50
10
80
************************
camisa: 90
bermuda: 50
calca: 10
sapato: 80
--------------------------
tempo execução em ms:
1










*/
