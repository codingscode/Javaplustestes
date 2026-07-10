package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		//
		String mostrar = String.format("%s tem %d anos", "aladim", 8); 
		
		System.out.println(mostrar);				
		
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
aladim tem 8 anos
--------------------------
tempo execução em ms: 31


 
 
*/
