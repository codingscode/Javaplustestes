package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		// primeira ocorrencia
		
		String s1 = "bacana planeta terra.";
		
		System.out.println(s1.indexOf("planeta"));
		System.out.println(s1.indexOf("p"));
		
		
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
7
7
--------------------------
tempo execução em ms: 0





 
 
*/
