package programa;

import java.util.Locale;

public class Tut001 {

	
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Locale.setDefault(Locale.US);

		
		
		
		
		
		

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
