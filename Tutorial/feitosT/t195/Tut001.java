package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		// .startsWith(), 
		
		String s1 = "disciplina+sabedoria";
		System.out.println(s1.subSequence(7, 12)); // nao é tipo String
		
		
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
ina+s
--------------------------
tempo execução em ms: 0



 
 
*/
