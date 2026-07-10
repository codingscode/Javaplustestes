package programa;

import java.util.HashMap;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // hashmap loop
		HashMap<String, Integer> nomes_idades = new HashMap<>();
		nomes_idades.put("joao", 18);
		nomes_idades.put("maria", 30);
		nomes_idades.put("jose", 22);
		nomes_idades.put("sara", 27);
		
		for (String cada : nomes_idades.keySet()) {
			System.out.print("chave: ");
			System.out.println(cada);
		}
		
		for (Integer cada : nomes_idades.values()) {
			System.out.print("valor: ");
			System.out.println(cada);
		}
		
		for (String cada : nomes_idades.keySet()) {
			System.out.print("chave: ");
			System.out.print(cada);
			System.out.print(", valor: ");
			System.out.println(nomes_idades.get(cada));
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
chave: joao
chave: jose
chave: sara
chave: maria
valor: 18
valor: 22
valor: 27
valor: 30
chave: joao, valor: 18
chave: jose, valor: 22
chave: sara, valor: 27
chave: maria, valor: 30
--------------------------
tempo execução em ms: 1


 
 
*/
