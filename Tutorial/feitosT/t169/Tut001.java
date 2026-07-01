package programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // embaralhar arrays
		
		String[] frutas = {"jaca", "laranja", "manga", "graviola"};
		System.out.println(Arrays.toString(frutas));
		
		List<String> lista= Arrays.asList(frutas);
		
		Collections.shuffle(lista);
		
		System.out.println(lista);
				
		
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
[jaca, laranja, manga, graviola]
[jaca, graviola, manga, laranja]
--------------------------
tempo execução em ms: 1


 
 
*/
