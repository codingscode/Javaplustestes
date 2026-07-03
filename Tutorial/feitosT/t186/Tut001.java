package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		// métodos .isEmpty(), .join(), 
		
		String s1 = "macaco";
		
		System.out.println(s1.length()); // tamanho
		
		
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
6
--------------------------
tempo execução em ms: 0





 
 
*/
