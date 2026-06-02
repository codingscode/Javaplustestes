package programa;

public class Tut001 {
	
		
	public static void main(String[] args) {
		
		// classe

		long startTime = System.nanoTime();

		Valores obj1 = new Valores();
		System.out.println(obj1.v1);
		System.out.println(obj1.v2);
		
		
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
3
6
--------------------------
tempo execução em ms:
0



*/
