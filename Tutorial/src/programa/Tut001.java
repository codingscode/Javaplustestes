package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		LinkedList<String> carros = new LinkedList<String>(List.of("celta", "fusca", "l200", "pajero", "fusca"));

		System.out.println(carros);
		
		
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
