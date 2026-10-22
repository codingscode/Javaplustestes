package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

        List<String> lista = new ArrayList<>() ; // ArrayList implementa List
		
		System.out.println(lista);

		lista.add("aladin");
		lista.add("mel");
		lista.add("lili");
		lista.add("liu");
		
		System.out.println(lista);
		
		for (String cada : lista) {
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
