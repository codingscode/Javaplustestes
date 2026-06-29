package programa;

import java.util.HashMap;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // frequencia
		String texto = "banana";
		
		HashMap<Character, Integer> frequencia = new HashMap<>();
		
		
		for (char cada : texto.toCharArray()) {
           frequencia.put(cada, frequencia.getOrDefault(cada, 0) + 1);	
		}
		
		System.out.println(frequencia);
		
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
{a=3, b=1, n=2}
--------------------------
tempo execução em ms: 0






 
 
*/
