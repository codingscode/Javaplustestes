package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // arrays metodos
		// 
		
		String[] frutas = {"jaca", "manga", "tanja", "ata", "graviola"};
		Arrays.fill(frutas, "laranja"); // preenche todos os elementos com um valor tal
		
		System.out.println(Arrays.toString(frutas));
		
		String[] frutas2 = {"jaca", "manga", "tanja", "ata", "graviola"};
		Arrays.fill(frutas2, 2, 4, "uva");
		System.out.println(Arrays.toString(frutas2));
		
		
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
[laranja, laranja, laranja, laranja, laranja]
[jaca, manga, uva, uva, graviola]
--------------------------
tempo execução em ms: 0






*/
