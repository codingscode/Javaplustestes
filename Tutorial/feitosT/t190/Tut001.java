package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		//  
		
		String s1 = "ubuntu é bom, ubuntu é fácil de usar, ubuntu é opensource.";
		
		String regex = "(?i)ubuntu"; // expressao regular
		
		System.out.println(s1.replaceAll(regex, "mx linux"));
		
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
mx linux é bom, mx linux é fácil de usar, mx linux é opensource.
--------------------------
tempo execução em ms: 0



 
 
*/
