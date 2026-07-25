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
		Scanner meu_objeto = new Scanner("a chance 45.8 porcento.");
		
		while(meu_objeto.hasNext()) {
		   if(meu_objeto.hasNextFloat()) {
		      float valor = meu_objeto.nextFloat();
              System.out.println(valor);
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
45.8
--------------------------
tempo execução em ms: 37








*/
