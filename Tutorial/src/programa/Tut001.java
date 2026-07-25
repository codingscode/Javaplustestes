package programa;

import java.util.Locale;
import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
        Locale.setDefault(Locale.US);
		
		// Create a scanner object
		Scanner meu_objeto = new Scanner("A string to scan");

		// Change configuration
		meu_objeto.useDelimiter(",");
		meu_objeto.useRadix(16);

		System.out.println(meu_objeto.delimiter());
		
		// Reset the configuration
		meu_objeto.reset();

		// Read configuration values
		System.out.println(meu_objeto.delimiter());
		System.out.println(meu_objeto.locale());
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
,
\p{javaWhitespace}+
en_US
10
--------------------------
tempo execução em ms: 33





*/
