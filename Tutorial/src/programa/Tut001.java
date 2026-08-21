package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        
        ArrayList<Integer> numeros1 = new ArrayList<>(List.of(3,4,5,6,7));
		
		ArrayList<Integer> numeros2 = new ArrayList<>(List.of(2,4,5,8,9));
		
		ArrayList<Integer> comum = new ArrayList<Integer>(numeros1.retainAll(numeros2));
		
		
		
		
		
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
