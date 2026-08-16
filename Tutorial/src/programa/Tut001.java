package programa;

import java.util.Arrays;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        
		String s1 = "bacana";
		char[] meu_array = s1.toCharArray();
		
		System.out.println(Arrays.toString(meu_array));
		System.out.println(meu_array);
		System.out.println(meu_array[0]);
		
		
		
		
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
