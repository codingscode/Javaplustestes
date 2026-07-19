package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		LinkedList<String> carros = new LinkedList<String>(List.of("celta", "fusca", "l200", "pajero"));
				
	    System.out.println(carros);
	    
	    System.out.println(carros.get(0));
	    System.out.println(carros.getFirst());
	    System.out.println(carros.getLast());
	    System.out.println(carros.indexOf("fusca"));
	    System.out.println(carros.isEmpty());
		
        
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
[celta, fusca, l200, pajero]
celta
celta
pajero
1
false
--------------------------
tempo execução em ms: 1




*/
