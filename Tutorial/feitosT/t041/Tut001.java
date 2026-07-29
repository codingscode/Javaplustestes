package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		
		// 
		long startTime = System.nanoTime();
		
		Cachorro cachorro = new Cachorro();
		cachorro.somAnimal();
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
	}

}

/*
animal faz um som
cachorro faz aua au
--------------------------
tempo execução em ms:
0


*/
