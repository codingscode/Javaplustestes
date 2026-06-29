package programa;

import java.util.Arrays;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // verificar se são anagramas
		
		String str1 = "listen";
		String str2 = "silent";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean eAnagrama = Arrays.equals(arr1, arr2);
		System.out.println(eAnagrama ? "anagrama" : "não é anagrama");
		
		
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
anagrama
--------------------------
tempo execução em ms: 1


 
 
*/
