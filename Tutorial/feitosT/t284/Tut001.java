package programa;

import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// 
		      
		Scanner meu_objeto = new Scanner("uma string para scanear");
		      
		// Find the delimiter
		System.out.println(meu_objeto.delimiter());

		// Close the scanner
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
\p{javaWhitespace}+
--------------------------
tempo execução em ms: 34








*/
