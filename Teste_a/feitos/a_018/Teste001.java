package Programa;

import java.util.HashMap;

public class Teste001 {
	
	

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		HashMap<String, Integer> produto = new HashMap<>();
		produto.put("preco", 10);
		produto.put("quantidade", 3);
		produto.put("frete", 2);
		
		System.out.println(produto);
		
		System.out.println(produto.get("frete"));
		
		// chave valor
		produto.forEach((c, v) -> System.out.println(c + ": " + v));
		
		
		System.out.println("--------------------------");
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		//milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}
	

}

/*
 
{preco=10, frete=2, quantidade=3}
2
preco: 10
frete: 2
quantidade: 3
--------------------------
--------------------------
tempo execução em ms:
24





*/
;