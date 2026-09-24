package programa;

import java.util.Locale;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Locale.setDefault(Locale.US);

		
		int a, b;
		double divisao;
		   
		a = 5;
		b = 2;
		divisao = a/b;
		   
		System.out.println("divisao: " + divisao);
		   
		divisao = (double) a/b; // cast
		System.out.println("divisao: " + divisao);
		

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
divisao: 2.0
divisao: 2.5
--------------------------
tempo execução em ms: 16


 
 
 
*/
