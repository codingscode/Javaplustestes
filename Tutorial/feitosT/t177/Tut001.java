package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		String s1 = "aladim";
		
		
		System.out.println(s1.contentEquals("aladim"));
		System.out.println(s1.contentEquals("im"));
		System.out.println(s1.contentEquals("di"));
		System.out.println(s1.contentEquals("l"));
		System.out.println(s1.contentEquals("x"));
		System.out.println(s1.contentEquals("ik"));
		
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
false
false
false
false
false
--------------------------
tempo execução em ms: 0


 
 
*/
