package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// potencia
		System.out.println(Math.pow(2, 8));
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.pow(9, 0.5));
		System.out.println(Math.pow(8, -1));
		System.out.println(Math.pow(10, -2));
		
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
256.0
81.0
3.0
0.125
0.01
--------------------------
tempo execução em ms: 0






*/
