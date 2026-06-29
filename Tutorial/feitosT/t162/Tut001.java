package programa;

import java.util.Arrays;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ordenar array
		
		String[] carros = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
	    
		Arrays.sort(carros);
	    
	    for (String cada : carros) {
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
Audi
BMW
Fiat
Ford
Mazda
Tesla
Volvo
--------------------------
tempo execução em ms: 0

 
 
*/
