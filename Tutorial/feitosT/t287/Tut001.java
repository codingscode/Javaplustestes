package programa;

import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// 
		      
		// Create a scanner object
		Scanner meu_objeto = new Scanner("aladim@gmail.com melzinha123@hotmail.com lily81@yahoo.com");

		//meu_objeto.useDelimiter("@");
		
		// Read every token
		while (meu_objeto.hasNext()) {
		   System.out.println(meu_objeto.next());
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
aladim@gmail.com
melzinha123@hotmail.com
lily81@yahoo.com
--------------------------
tempo execução em ms: 35








*/
