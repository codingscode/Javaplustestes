package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		LinkedList<String> carros = new LinkedList<String>(List.of("celta", "fusca", "l200", "pajero"));
				
	    System.out.println(carros);
	    
	    carros.add(2, "d20"); // insere no indice e afasta o resto
	    
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
[celta, fusca, l200, pajero]
[celta, fusca, d20, l200, pajero]
--------------------------
tempo execução em ms: 1







*/
