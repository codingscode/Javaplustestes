package programa;

import java.util.Locale;
import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// .useDelimiter(), .hasNextBoolean(), 
		
		Locale.setDefault(Locale.US); 
		      
		// Create a scanner object
		Scanner meu_objeto = new Scanner("um inteiro é um número entre -2,147,483,648 e 2,147,483,647");
		
		while(meu_objeto.hasNext()) {
		   if(meu_objeto.hasNextInt()) {
		      System.out.println(meu_objeto.nextInt());
		   }
		   else {
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
-2147483648
2147483647
--------------------------
tempo execução em ms: 34








*/
