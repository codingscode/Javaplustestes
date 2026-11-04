package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(3);
        numeros.add(7);
        numeros.add(2);
		
		System.out.println(numeros.get(0));
		
		

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime);

		// milliseconds
		System.out.print("tempo execução em ns: ");
		System.out.println(duration);
	}

}

/*







 
 
*/
