package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		LinkedList<String> carros = new LinkedList<String>(List.of("mercedez", "ferrari", "celta", "fusca", "vectra", "l200", "pajero"));
		
		System.out.println(carros);

		carros.removeFirst(); // tira primeiro
		
		System.out.println(carros);
		
		carros.removeLast(); // tira ultimo
		
		System.out.println(carros);
		
		carros.removeIf(cada -> cada.charAt(0) == 'v');
		
		System.out.println(carros);
		
		carros.removeAll(carros);
		
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
[mercedez, ferrari, celta, fusca, vectra, l200, pajero]
[ferrari, celta, fusca, vectra, l200, pajero]
[ferrari, celta, fusca, vectra, l200]
[ferrari, celta, fusca, l200]
[]
--------------------------
tempo execução em ms: 9



*/
