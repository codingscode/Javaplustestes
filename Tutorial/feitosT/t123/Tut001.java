package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Wrapper Class -> Integer, Character, Double, Boolean...
		// Primitive Data Type -> int, char, double, boolean...

		Integer inteiro = 5;
	    Double duplo = 5.99;
	    Character caractere = 'A';
	    
	    System.out.println(inteiro);
	    System.out.println(duplo);
	    System.out.println(caractere);

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
5.99
A
--------------------------
tempo execução em ms:
0





*/
