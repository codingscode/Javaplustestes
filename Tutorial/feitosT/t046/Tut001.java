package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		
		// 
		long startTime = System.nanoTime();
		
		ClasseExterna.ClasseInterna dentro = new ClasseExterna.ClasseInterna();
		
		System.out.println(dentro.y);
		
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
5
--------------------------
tempo execução em ms:
0





*/
