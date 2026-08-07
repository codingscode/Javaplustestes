package programa;

import java.util.HashMap;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Map interface
		// put(), get(), remove(), containsKey(), keySet()
		HashMap<String, Integer> frutas = new HashMap<String, Integer>();
		
		frutas.put("laranja", 4);
		frutas.put("maca", 8);
		frutas.put("banana", 5);
		frutas.put("abacaxi", 4);
		
		System.out.println(frutas);
		System.out.println(frutas.size());
		
		System.out.println(frutas.get("maca"));
		
		System.out.println("********************");
		
		for (String chave : frutas.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("********************");
		
		for (Integer valor : frutas.values()) {
			System.out.println(valor);
		}
		
		System.out.println("********************");
		
		for (String chave : frutas.keySet()) {
			System.out.println(chave);
			System.out.println(frutas.get(chave));
		}
		
		
		System.out.println("********************");
		
		frutas.remove("banana");
		System.out.println(frutas);
		
		frutas.clear();
		System.out.println(frutas);

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
{banana=5, maca=8, abacaxi=4, laranja=4}
4
8
********************
banana
maca
abacaxi
laranja
********************
5
8
4
4
********************
banana
5
maca
8
abacaxi
4
laranja
4
********************
{maca=8, abacaxi=4, laranja=4}
{}
--------------------------
tempo execução em ms:
1




*/
