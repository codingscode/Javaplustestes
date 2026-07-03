package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		// métodos 
		
		String regex = "gato|cachorro|peixe"; // expressao regular

		System.out.println("gato".matches(regex));
		System.out.println("cachorro".matches(regex));
		System.out.println("peixe gato".matches(regex));
		System.out.println("cachorro bolsa".matches(regex));		
		
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
