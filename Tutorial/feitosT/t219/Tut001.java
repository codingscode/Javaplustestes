package programa;

import java.util.Arrays;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // arrays metodos
		// 
		
		int[] numeros = {10, 4, 2, 7};
		int[] lista = {20, 3, 10, 1, 15, 12};
		
		Arrays.sort(numeros);
		Arrays.sort(lista, 1, 4); // ordena somente do indice 1 ao 3
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(lista));
		
		
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
[2, 4, 7, 10]
[20, 1, 3, 10, 15, 12]
--------------------------
tempo execução em ms: 1






*/
