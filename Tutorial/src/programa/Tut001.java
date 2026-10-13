package programa;

import java.util.Set;
import java.util.TreeSet;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

        Set<String> set = new TreeSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("pendrive");

		System.out.println(set.contains("Notebook"));

		for (String cada : set) {
			System.out.println(cada);
		}

		

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
