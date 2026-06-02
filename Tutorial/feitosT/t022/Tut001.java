package programa;

public class Tut001 {
	
	int x = 5;

	
	public static void main(String[] args) {
		
		// classe

		long startTime = System.nanoTime();

		Tut001 meuobjeto = new Tut001();
		
		System.out.println(meuobjeto.x);
		
		
		
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
5
--------------------------
tempo execução em ms:
0



*/
