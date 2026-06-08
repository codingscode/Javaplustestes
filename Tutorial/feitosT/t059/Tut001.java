package programa;

import java.time.LocalDate;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		LocalDate objeto = LocalDate.now(); // cria um objeto data
		System.out.println(objeto); // mostra a data corrente
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
	}

}

/*
2026-06-08
--------------------------
tempo execução em ms:
29




*/
