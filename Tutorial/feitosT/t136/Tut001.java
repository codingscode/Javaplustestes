package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// lambda
		ArrayList<Integer> numeros = new ArrayList<Integer>(List.of(6, 9, 2, 10, 5));

		System.out.println(numeros);
		
		// usando lambda
		
		Consumer<Integer> metodo = (cada) -> { System.out.println(cada); }; // nao eficiente
		numeros.forEach(metodo);
		
		
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
[6, 9, 2, 10, 5]
6
9
2
10
5
--------------------------
tempo execução em ms: 9




 
 
*/
