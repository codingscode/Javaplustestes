package programa;

import java.time.LocalTime;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		LocalTime objeto = LocalTime.now(); // 
		System.out.println(objeto); //

		
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

medio nivel
--------------------------
tempo execução em ms: 0








*/
