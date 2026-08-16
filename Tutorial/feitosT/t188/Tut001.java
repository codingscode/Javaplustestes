package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		// se regioes iguais 
		
		String s1 = "bacana, mundo!";
		String s2 = "novo mundo";
		
		System.out.println(s1.regionMatches(7, s2, 4, 5));
		System.out.println(s1.regionMatches(0, s2, 0, 5));		
		
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
--------------------------
tempo execução em ms: 0





 
 
*/
