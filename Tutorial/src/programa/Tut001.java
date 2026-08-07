package programa;

import java.util.Arrays;
import java.util.HashMap;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        HashMap<String, Integer> frutas = new HashMap<String, Integer>();
		
		frutas.put("laranja", 4);
		frutas.put("maca", 8);
		frutas.put("banana", 5);
		frutas.put("abacaxi", 4);
		
		System.out.println(Arrays.toString(frutas.keySet()));

		
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
