package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// .min() o menor
		System.out.println(Math.max(2.0, 0.25));
		System.out.println(Math.max(4, 10));
		//System.out.println(Math.max(4, 10, 7)); // somente pares
		
		
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
2.0
10
--------------------------
tempo execução em ms: 0






*/
