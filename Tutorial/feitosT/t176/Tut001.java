package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		String s1 = "Aladim";
		
		
		System.out.println(s1.contains("l"));
		System.out.println(s1.contains("im"));
		System.out.println(s1.contains("L"));
		System.out.println(s1.contains("x"));
		
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
true
true
false
false
--------------------------
tempo execução em ms: 0


 
 
*/
