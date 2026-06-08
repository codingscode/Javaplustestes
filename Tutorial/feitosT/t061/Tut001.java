package programa;

import java.time.LocalDateTime;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		LocalDateTime objeto = LocalDateTime.now(); // 
		System.out.println(objeto); // 
		
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
2026-06-08T10:14:27.330286499
--------------------------
tempo execução em ms:
30






*/
