package programa;

import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		LinkedList<String> carros = new LinkedList<String>(List.of("mercedez", "ferrari", "celta", "fusca", "l200", "pajero"));
		
		System.out.println(carros);
				
		System.out.println(carros.pop()); // remove o primeiro e retorna
		
		System.out.println(carros);
		
        carros.push("gol"); // adiciona no inicio
		
		System.out.println(carros);
		
		carros.remove(1); // remove indice 1
		
		System.out.println(carros);
		
		carros.remove("pajero");
		
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
[mercedez, ferrari, celta, fusca, l200, pajero]
mercedez
[ferrari, celta, fusca, l200, pajero]
[gol, ferrari, celta, fusca, l200, pajero]
[gol, celta, fusca, l200, pajero]
[gol, celta, fusca, l200]
--------------------------
tempo execução em ms: 1



*/
