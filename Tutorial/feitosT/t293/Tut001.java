package programa;

import java.util.Locale;
import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// .hasNextLong(), .nextLong() , .hasNextShort(), nextShort(),
		
		Locale.setDefault(Locale.US);
		
		// Create a scanner object
		Scanner meu_objeto = new Scanner("A string to scan");

		// Display the radix (defaults to 10) // decimal 0 a 9
		System.out.println(meu_objeto.radix());
		
		meu_objeto.close();
				
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
10
--------------------------
tempo execução em ms: 31



*/
