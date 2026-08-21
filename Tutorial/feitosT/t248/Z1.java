package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		ArrayList<String> nomes = new ArrayList<>(List.of("mel", "aladim", "apolo", "lily", "pituxo", "preta"));

		// Converte para array de String
		String[] nomesArray = nomes.toArray(new String[0]);
		
		System.out.println(nomes);
		
		System.out.println(nomesArray);
		
		for (String cada : nomesArray) {
			System.out.println(cada);
		}
		
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
[mel, aladim, apolo, lily, pituxo, preta]
[Ljava.lang.String;@659e0bfd
mel
aladim
apolo
lily
pituxo
preta
--------------------------
tempo execução em ms: 0


*/
