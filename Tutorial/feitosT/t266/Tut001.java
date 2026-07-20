package programa;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos LinkedList(encadeado ordem de inserção)
		// replaceAll
		LinkedList<String> nomes = new LinkedList<String>(List.of("mel", "aladim", "lily", "apolo", "pituxo"));
		
		System.out.println(nomes);
		
		System.out.println(nomes.size());
		
		nomes.set(0, "fiona");
		
		System.out.println(nomes);
		
		nomes.sort(null);
		
		System.out.println(nomes);
		
		System.out.println(nomes.subList(1, 3));
		
		System.out.println(nomes);
		
		String[] outro = new String[5];
		
		outro = nomes.toArray(outro);
		
		System.out.println(Arrays.toString(outro));
		
        
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
[mel, aladim, lily, apolo, pituxo]
5
[fiona, aladim, lily, apolo, pituxo]
[aladim, apolo, fiona, lily, pituxo]
[apolo, fiona]
[aladim, apolo, fiona, lily, pituxo]
[aladim, apolo, fiona, lily, pituxo]
--------------------------
tempo execução em ms: 2



*/
