package programa;

import java.util.Arrays;
import java.util.HashSet;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// remover duplicados de um array
		Integer[] numeros = {1, 2, 2, 3, 4, 4, 5};
				
		HashSet<Integer> unicos = new HashSet<>();
		
		for (Integer cada : numeros) {
			unicos.add(cada);
		}
				
		System.out.println(Arrays.toString(numeros));
		System.out.println(unicos);
		
		
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






*/
