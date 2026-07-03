package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		//  
		
		String s1 = "banana";
		System.out.println(s1.replace('n', 'x')); // substitui todo n por x
		
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
baxaxa
--------------------------
tempo execução em ms: 0





 
 
*/
