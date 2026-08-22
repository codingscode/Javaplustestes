package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		ArrayList<String> nomes = new ArrayList<String>(List.of("lily", "aladin", "mel"));
		
		
		System.out.println(nomes);

		
		
		System.out.println(nomes);
		
		
		
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
