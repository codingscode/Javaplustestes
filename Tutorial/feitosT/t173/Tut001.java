package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		String string1 = "bacana";
		String string2 = "bacana";
		String string3 = "aladim";
		
		System.out.println(string1.compareTo(string2)); // Returns 0 because they are equal
		System.out.println(string1.compareTo(string3));
		
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
0
1
--------------------------
tempo execução em ms: 0




 
 
*/
