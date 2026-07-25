package programa;

import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// 
		      
		// Create a scanner object
		Scanner meu_objeto = new Scanner("aladim@gmail.com melzinha123@hotmail.com lily81@yahoo.com");

		// Get the email address with a pattern
		String email = meu_objeto.findWithinHorizon("[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]{2,}", 0); // encontra 1ª combinação

		// Show the email if found
		if (email != null) {
		   System.out.println(email);
		}
		else {
		   System.out.println("nenhum email encontrado.");
		}

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
aladim@gmail.com
--------------------------
tempo execução em ms: 35








*/
