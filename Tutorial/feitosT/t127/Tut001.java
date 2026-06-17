package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Generics
		// Use com Integer
	    Integer[] intnums = {10, 20, 30, 40};
	    Generico<Integer> intGeneric = new Generico<>(intnums);
	    System.out.print("media Integer: ");
	    System.out.println(intGeneric.media());

	    // Use com Double
	    Double[] doublenums = {1.5, 2.5, 3.5};
	    Generico<Double> doubleStats = new Generico<>(doublenums);
	    System.out.print("media Double: ");
	    System.out.println(doubleStats.media());

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
media Integer: 25.0
media Double: 2.5
--------------------------
tempo execução em ms:
0












*/
