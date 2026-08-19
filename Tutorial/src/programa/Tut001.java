package programa;

import java.util.Arrays;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        
		int[] array1 = {10, 20, 30, 40};
        int[] array2 = {10, 20, 99, 40};
        int[] array3 = {10, 20};

        // Returns 2 because array1[2] != array2[2]
        //int indexDiff = Arrays.mismatch(array1, array2);
        
        System.out.println(Arrays.mismatch(array1, array3));
        System.out.println(Arrays.mismatch(array1, array1));
		
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

1
2
5
--------------------------
tempo execução em ms: 0





*/
