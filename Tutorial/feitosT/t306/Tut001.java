package programa;

import java.util.Scanner;

public class Tut001 {
	
	
	/*
	nextInt() for whole numbers
    nextLine() for full text lines
    nextDouble() for decimal numbers
    next() for single words
		
	*/
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Creating Scanner object
        Scanner scn = new Scanner(System.in);

        System.out.print("digite o 1º número: ");
        int a = scn.nextInt();

        System.out.print("digite o 2º número: ");
        int b = scn.nextInt();

        System.out.println("soma: " + (a + b));
        scn.close();	
		
		
		
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










*/
