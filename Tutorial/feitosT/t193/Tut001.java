package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		// dividir uma string em um array de strings
		
		String s1 = "divida uma string em espacos, e também pontuacao.";
		
		String regex = "[,\\.\\s]";
		
		String[] meu_array = s1.split(regex);
		
		System.out.println(Arrays.toString(meu_array));
		
		
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
[divida, uma, string, em, espacos, , e, também, pontuacao]
--------------------------
tempo execução em ms: 10





 
 
*/
