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
		
		Scanner scn = new Scanner(System.in);

        // Reading a single line string
        System.out.print("digite uma sentença: ");
        String sentence = scn.nextLine();
        System.out.print("sentença digitada: ");
        System.out.println(sentence);

        // Reading an integer
        System.out.print("digite um inteiro: ");
        int x = Integer.parseInt(scn.nextLine());
        System.out.print("inteiro digitado: ");
        System.out.println(x);

        // Reading a float value
        System.out.print("digite um valor float: ");
        float f = Float.parseFloat(scn.nextLine());
        System.out.print("valor float digitado: ");
        System.out.println(f);

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
digite uma sentença: aladim cachorro
sentença digitada: aladim cachorro
digite um inteiro: 4
inteiro digitado: 4
digite um valor float: 1.2
valor float digitado: 1.2
--------------------------
tempo execução em ms: 14876










*/
