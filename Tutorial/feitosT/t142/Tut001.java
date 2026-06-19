package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		ArrayList<Integer> meusNumeros = new ArrayList<Integer>(List.of(33,15,20,34,8,12));
		
	    Comparator meuComparador = new OrdParPrimeiro();
	    Collections.sort(meusNumeros, meuComparador);

	    for (int i : meusNumeros) {
	      System.out.println(i);
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
8
12
20
34
15
33
--------------------------
tempo execução em ms: 1







 
 
*/
