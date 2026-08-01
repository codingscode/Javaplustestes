package programa;

import java.time.LocalTime;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		LocalTime objeto = LocalTime.now(); // 
		System.out.println(objeto); // mostra horario local
		
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
10:09:53.820020097
--------------------------
tempo execução em ms:
29




*/
