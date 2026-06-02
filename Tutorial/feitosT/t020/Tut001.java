package programa;

public class Tut001 {
	
	

	public static void main(String[] args) {
		
		// overloading -> funções com mesmo nome

		long startTime = System.nanoTime();

		//System.out.println(x); // dá erro, está fora de escopo
		
		int x = 3;
		
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*








*/
