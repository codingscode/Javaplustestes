package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<String> nomes = new ArrayList<>(List.of("mel", "aladim", "apolo", "lily", "pituxo", "preta"));
		
		System.out.println(nomes.subList(1, 3));

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
[aladim, apolo]
--------------------------
tempo execução em ms: 0



*/
