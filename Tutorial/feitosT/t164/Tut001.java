package programa;

import java.util.Arrays;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // unir dois arrays
		
		int[] a = {1, 2, 3};
		int[] b = {4, 5};
		
		int[] unido = new int[a.length + b.length];
		
		for (int i=0; i < a.length; i++) {
			unido[i] = a[i];
		}
		
		for (int i=0; i < b.length; i++) {
			unido[a.length+i] = b[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(unido));
		
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
[1, 2, 3]
[4, 5]
[1, 2, 3, 4, 5]
--------------------------
tempo execução em ms: 0

 
 
*/
