package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// logaritmo base 10
		System.out.println(Math.log10(10));
		System.out.println(Math.log10(20));
		System.out.println(Math.log10(1));
		System.out.println(Math.log10(-10));
		System.out.println(Math.log10(100));
		System.out.println(Math.log10(0.001));
		
		
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
1.0
1.3010299956639813
0.0
NaN
2.0
-3.0
--------------------------
tempo execução em ms: 0






*/
