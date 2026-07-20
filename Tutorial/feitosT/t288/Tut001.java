package programa;

import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// .hasNextBoolean(), 
		      
		// Create a scanner object
		Scanner meu_objeto = new Scanner("A byte is a number between -128 and 127");
		
		// Print the value of every byte in the scanner
		while(meu_objeto.hasNext()) {
		  if(meu_objeto.hasNextByte()) {
		    System.out.println(meu_objeto.nextByte());
		  } else {
			  meu_objeto.next();
		  }
		}
		
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
-128
127
--------------------------
tempo execução em ms: 37








*/
