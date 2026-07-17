package programa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        HashSet<Integer> numeros = new HashSet<>(List.of(1,2,3));
        
        Integer[] outro = numeros.toArray(new Integer[0]);
        
        System.out.println(Arrays.toString(outro));
		
        
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
[mel, aladim, apolo, lily, pituxo, preta]
[mel, aladim, apolo, lily, pituxo, preta]
[fiona, apolo]
--------------------------
tempo execução em ms: 0




*/
